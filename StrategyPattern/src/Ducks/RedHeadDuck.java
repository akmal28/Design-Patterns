package Ducks;

import Fly.FlyWithWings;
import Quack.Squeak;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck!");
    }
}
