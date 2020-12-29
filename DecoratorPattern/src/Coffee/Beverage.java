package Coffee;

public abstract class Beverage {
    String description = "Unknown Coffee.Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract int cost();
}
