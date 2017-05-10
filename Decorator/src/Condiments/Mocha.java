package Condiments;

import Beverages.Beverage;

/**
 * Created by azkei on 10/05/2017.
 */
//Condiments.Mocha is a decorator, so we extend Condiments.CondimentDecorator
public class Mocha extends CondimentDecorator {
    //We're going to instantiate Condiments.Mocha with reference to a Beverages.Beverage using:
    //1. An instance variable to hold the beverage we are wrapping
    //2. A way to set this instance variable to the object we are wrapping.
    //Here we're going to pass the beverage were wrapping to the decorators constructor
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        //We want our description to not only include the beverage but also the condiments.
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        //We also want to compute the cost of the condiment on top of the beverage.
        return .20 + beverage.cost();
    }
}
