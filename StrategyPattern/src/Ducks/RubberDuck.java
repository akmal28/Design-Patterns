package Ducks;

import Fly.NoFly;
import Quack.NoQuack;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm just a rubber duck..");
    }
}
