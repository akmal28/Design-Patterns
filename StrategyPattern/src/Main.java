import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Ducks.RubberDuck;
import Fly.FlyWithRocket;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedHeadDuck();
        Duck rubber = new RubberDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        redHead.display();
        redHead.performFly();
        redHead.performQuack();

        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.setFlyBehavior(new FlyWithRocket());
        rubber.performFly();
    }
}
