package DecoratorPattern;

import DecoratorPattern.BeverageTypes.Decaf;
import DecoratorPattern.Materials.Caramel;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Caramel(new Decaf());
        System.out.println(beverage.desc());
        System.out.println(beverage.cost());
    }
}
