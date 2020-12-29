package FactoryMethod;

public class Facebook extends Profile{
    @Override
    public void createSection() {
        this.addSection(new PersonalSection());
        this.addSection(new AlbumSection());
    }
}
