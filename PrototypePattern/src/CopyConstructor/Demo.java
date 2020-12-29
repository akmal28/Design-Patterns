package CopyConstructor;

public class Demo {
    public static void main(String[] args) {
        Employee john = new Employee("John", new Address("Jl Bunga", "Jakarta", "Indonesia"));

        Employee chris = new Employee(john);
        chris.name = "Chris";
        chris.address.streetAddress = "Jl Cinta";

        System.out.println(john);
        System.out.println(chris);
    }
}
