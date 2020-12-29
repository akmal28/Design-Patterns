package Exercise;

import java.util.ArrayList;
import java.util.Collections;

public class CodeElement {
    public String name, type;
    public ArrayList<CodeElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();
    private final String access = "public";

    public CodeElement() {
    }

    public CodeElement(String name, String type) {
        this.name = name;
        this.type = type;
    }

    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();

        if (name != null && type == null) {
            sb.append(String.format("%s class %s%s{%s", access, name, newLine, newLine));
        }

        if (type != null && !name.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize*(indent+1), " ")))
                    .append(String.format("%s %s %s;", access, type, name))
                    .append(newLine);
        }

        for (CodeElement e : elements)
            sb.append(e.toStringImpl(indent));

        return sb.toString();
    }

    @Override
    public String toString() {
        String code = toStringImpl(0);
        return code + "}";
    }
}
