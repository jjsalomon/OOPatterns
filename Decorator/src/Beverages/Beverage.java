package Beverages;

/**
 * Created by azkei on 10/05/2017.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
