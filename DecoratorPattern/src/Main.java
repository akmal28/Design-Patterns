import Coffee.Beverage;
import Coffee.Espresso;
import Coffee.Mocha;
import Coffee.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
