package Exercise;

public class Demo {
    public static void main(String[] args) {
        Person person = new PersonFactory().createPerson("Akmal");
        Person person1 = new PersonFactory().createPerson("John");
        System.out.println(person);
        System.out.println(person1);
    }
}
