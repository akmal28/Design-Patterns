package FacetedBuilder;

public class PersonEmploymentBuilder extends PersonBuilder{

    public PersonEmploymentBuilder(Person person) {
        this.person = person;
    }

    public PersonEmploymentBuilder at(String companyName) {
        this.person.companyName = companyName;
        return this;
    }

    public PersonEmploymentBuilder asA(String position) {
        this.person.position = position;
        return this;
    }

    public PersonEmploymentBuilder earning(int annualIncome) {
        this.person.annualIncome = annualIncome;
        return this;
    }
}
