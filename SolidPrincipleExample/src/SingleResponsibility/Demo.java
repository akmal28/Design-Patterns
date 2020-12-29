package SingleResponsibility;

public class Demo {
    public static void main(String[] args) throws Exception{
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate kebab");

        Persistence persistence = new Persistence();
        String fileName = "D:\\akmal\\Learn Kotlin\\journal.txt";
        persistence.saveToFile(journal,fileName,true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }
}
