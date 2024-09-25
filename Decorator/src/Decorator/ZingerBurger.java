package Decorator;
public class ZingerBurger extends Burger {

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }
     @Override
     public double getCost() {
        return 220.50;
     }
}
