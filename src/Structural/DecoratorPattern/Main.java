package Structural.DecoratorPattern;


import Structural.DecoratorPattern.BeverageTypes.Decaf;
import Structural.DecoratorPattern.Materials.Caramel;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Caramel(new Decaf());
        System.out.println(beverage.desc());
        System.out.println(beverage.cost());
    }
}
