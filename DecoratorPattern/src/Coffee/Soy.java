package Coffee;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Coffee.Soy";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 3;
    }
}
