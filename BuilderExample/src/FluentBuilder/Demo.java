package FluentBuilder;

public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();
        Person person = builder.withName("Akmal").worksAt("QA").build();
        System.out.println(person);
    }
}
