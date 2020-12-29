package Coffee;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public int cost() {
        return 2;
    }
}
