package Exercise;

public class CodeBuilder {
    private String className;
    private CodeElement root = new CodeElement();

    public CodeBuilder(String className) {
        this.className = className;
        root.name = className;
    }

    public CodeBuilder addField(String name, String type) {
        CodeElement codeElement = new CodeElement(name, type);
        root.elements.add(codeElement);
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
