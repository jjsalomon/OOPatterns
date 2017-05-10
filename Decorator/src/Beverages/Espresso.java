package Beverages;

/**
 * Created by azkei on 10/05/2017.
 */
public class Espresso extends Beverage {

    //to take care of the description, we set this in the constructor for the class.
    //The description instance variable is inherited from Beverages.Beverage
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        //finally we need to compute the cost of an espresso.
        //we dont need to worry about adding in condiments in this class.
        //we just need to return the price of an Beverages.Espresso 1.99
        return 1.99;
    }
}
