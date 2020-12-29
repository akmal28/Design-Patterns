package FacetedBuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        Person person = builder
                .lives()
                    .at("Arwana 4th")
                    .in("South Tangerang")
                    .postal("15415")
                .works()
                    .at("Jaya")
                    .asA("Engineer")
                    .earning(6000000)
                .build();
        System.out.println(person);
    }
}
