import Beverages.Americano;
import Beverages.Beverage;
import Beverages.Espresso;
import Beverages.HouseBlend;
import Condiments.Mocha;
import Condiments.SoyMilk;

public class Main {

    public static void main(String[] args) {

        //order an espresso with no condiments
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()
                +" $"+ espresso.cost()+"\n");

        // order a houseblend with mocha
        Beverage houseblend = new HouseBlend();
        houseblend = new Mocha(houseblend);
        System.out.println(houseblend.getDescription()
                +" $"+ houseblend.cost()+"\n");

        //order an american with soy and mocha
        Beverage americano = new Americano();
        americano = new Mocha(americano);
        americano = new SoyMilk(americano);
        System.out.println(americano.getDescription()
                + " $"+americano.cost()+"\n");
    }
}
