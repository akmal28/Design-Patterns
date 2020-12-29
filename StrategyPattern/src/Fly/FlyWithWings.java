package Fly;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("The duck is flying with his wings!");
    }
}
