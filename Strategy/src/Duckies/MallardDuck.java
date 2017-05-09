package Duckies;

import Behaviors.Fly.FlyWithWings;
import Behaviors.Quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		//taken quack and fly behavior and integrated it into mallard duck
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I am a real Mallard Duckies.Duck!");
	}
}