package FacetedBuilder;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonEmploymentBuilder works() {
        return new PersonEmploymentBuilder(person);
    }

    public Person build() {
        return person;
    }
}
