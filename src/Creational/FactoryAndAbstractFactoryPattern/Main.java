package Creational.FactoryAndAbstractFactoryPattern;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators.ChicagoPizzaIngredientFactory;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators.NYPizzaIngredientFactory;
import Creational.FactoryAndAbstractFactoryPattern.FactoryPattern.ChicagoPizzaStore;

public class Main {

    public static void main(String[] args) {

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore(new ChicagoPizzaIngredientFactory());
        chicagoPizzaStore.orderPizza("cheese");

        ChicagoPizzaStore chicagoPizzaStore1 = new ChicagoPizzaStore(new NYPizzaIngredientFactory());
        chicagoPizzaStore1.orderPizza("cheese");
    }
}
