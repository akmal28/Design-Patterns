package FactoryMethod;

public class ProfileFactory {

    public Profile getProfile(String name) throws Exception {
        if (name.equals("Facebook") || name.equals("facebook")) {
            return new Facebook();
        } else if (name.equals("Linkedin") || name.equals("linkedin")) {
            return new Linkedin();
        } else {
            throw new Exception("Unknown");
        }
    }
}
