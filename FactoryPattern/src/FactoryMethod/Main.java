package FactoryMethod;

public class Main {
    public static void main(String[] args) throws Exception {
        ProfileFactory profileFactory = new ProfileFactory();

        Profile facebook = profileFactory.getProfile("facebook");
        facebook.printSections();

        Profile linkedin = profileFactory.getProfile("linkedin");
        linkedin.printSections();

        Profile twitter = profileFactory.getProfile("twitter");
        twitter.printSections();
    }


}
