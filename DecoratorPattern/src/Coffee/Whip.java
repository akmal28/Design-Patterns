package Coffee;

public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Coffee.Whip";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 4;
    }
}
