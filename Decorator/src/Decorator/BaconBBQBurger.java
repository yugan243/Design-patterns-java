package Decorator;
public class BaconBBQBurger extends BurgerDecorator {
    public BaconBBQBurger(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ " with extra BBQ";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 60.75;
    }
}
