package SingleResponsibility;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> entries = new ArrayList<>();
    private int count = 0;

    public void addEntry(String journal) {
        entries.add(""+ (++count) + ": " + journal);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(),entries);
    }

    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)){
            out.println(toString());
        }
    }
}
