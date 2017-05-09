package Duckies;

import Behaviors.Fly.FlyWithWings;
import Behaviors.Quack.MuteQuack;

/**
 * Created by azkei on 09/05/2017.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();

    }
    public void display() {
        System.out.println("I am a RedheadDuck!");
    }
}
