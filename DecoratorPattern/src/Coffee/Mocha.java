package Coffee;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Coffee.Mocha";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
}
