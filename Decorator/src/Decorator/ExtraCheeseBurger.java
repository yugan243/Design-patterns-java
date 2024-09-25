package Decorator;
public class ExtraCheeseBurger extends BurgerDecorator {

    public ExtraCheeseBurger(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 45.00;
    }
    
}
