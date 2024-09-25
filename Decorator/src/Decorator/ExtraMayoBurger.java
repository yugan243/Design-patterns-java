package Decorator;
public class ExtraMayoBurger extends BurgerDecorator{
    
    public ExtraMayoBurger(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra mayo";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 60;
    }
    
    
}
