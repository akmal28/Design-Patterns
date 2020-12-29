package Quack;

public class NoQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("silent..");
    }
}
