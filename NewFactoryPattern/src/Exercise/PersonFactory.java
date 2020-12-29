package Exercise;

public class PersonFactory {
    private static int id = 0;

    public Person createPerson(String name) {
        return new Person(id++, name);
    }
}
