package FactoryMethod;

import java.util.ArrayList;

public abstract class Profile {
    ArrayList<Section> sections;

    public Profile() {
        this.sections = new ArrayList<>();
        createSection();
    }

    public abstract void createSection();

    public ArrayList<Section> getSections() {
        return this.sections;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void printSections(){
        for (Section section:getSections()) {
            System.out.println(section.describe());
        }
    }
}
