package Coffee;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Coffee.Espresso";
    }

    @Override
    public int cost() {
        return 1;
    }
}
