package Exercise;

public class Demo {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
        CodeBuilder cb2 = new CodeBuilder("Foo");
        System.out.println(cb2);
    }
}
