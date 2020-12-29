package Fly;

public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("The duck can't fly :(");
    }
}
