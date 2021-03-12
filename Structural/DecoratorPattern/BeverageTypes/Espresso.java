package DecoratorPattern.BeverageTypes;

import DecoratorPattern.Beverage;

public class Espresso extends Beverage {

    @Override
    public double cost() {
        return 1;
    }

    @Override
    public String desc() {
        return "Espresso";
    }
}
