package AbstractFactory;

public class Tea implements HotDrink{

    @Override
    public void consume() {
        System.out.println("This Tea is delicious!");
    }
}
