package Duckies;

import Behaviors.Fly.FlyNoWay;
import Behaviors.Quack.Squeak;

/**
 * Created by azkei on 09/05/2017.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    public void display() {
        System.out.println("I am a model duck !");
    }
}
