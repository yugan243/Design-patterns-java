package Decorator;
public abstract class BurgerDecorator extends Burger {
    protected Burger burger;

    public BurgerDecorator (Burger burger) {
        this.burger = burger;
    }

}
