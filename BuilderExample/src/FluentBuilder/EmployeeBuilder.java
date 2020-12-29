package FluentBuilder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{

    public EmployeeBuilder worksAt(String position) {
        person.position = position;
        return self();
    }

    @Override
    public EmployeeBuilder self() {
        return this;
    }
}
