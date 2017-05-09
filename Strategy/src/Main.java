import Behaviors.Fly.FlyRocketPowered;
import Duckies.Duck;
import Duckies.MallardDuck;
import Duckies.ModelDuck;
import Duckies.RedheadDuck;

public class Main {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performFly();
        redhead.performQuack();
    }
}
