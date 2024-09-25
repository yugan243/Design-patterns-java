package Decorator;
public class BurgerMaker {
    public static void main(String[] args) throws Exception {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() + ", "+ burger.getCost() );

        burger = new ExtraCheeseBurger( burger);
        System.out.println(burger.getDescription()+", " + burger.getCost());

        burger = new ExtraMayoBurger(burger);
        System.out.println(burger.getDescription()+ ", "+ burger.getCost());

        burger = new BaconBBQBurger(burger);
        System.out.println(burger.getDescription() + ", "+ burger.getCost());

        Burger burgerorder = new ExtraCheeseBurger(new ExtraMayoBurger(new ZingerBurger()));
        System.out.println(burgerorder.getDescription()+ ", "+ burgerorder.getCost());
    }
}
