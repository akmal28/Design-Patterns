package FactoryMethod;

public class Linkedin extends Profile{

    @Override
    public void createSection() {
        this.addSection(new PersonalSection());
        this.addSection(new PatentSection());
        this.addSection(new PublicationSection());
    }
}
