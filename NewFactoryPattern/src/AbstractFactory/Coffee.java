package AbstractFactory;

public class Coffee implements HotDrink{
    @Override
    public void consume() {
        System.out.println("I like this coffee!");
    }
}
