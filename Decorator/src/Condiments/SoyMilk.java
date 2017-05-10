package Condiments;

import Beverages.Beverage;

/**
 * Created by azkei on 10/05/2017.
 */
public class SoyMilk extends CondimentDecorator {

    Beverage beverage;

    public SoyMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Soy Milk";
    }


    public double cost() {
        return .30 + beverage.cost();
    }
}
