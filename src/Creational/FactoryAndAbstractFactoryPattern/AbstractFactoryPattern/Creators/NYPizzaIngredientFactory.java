package Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Dough;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.DoughA;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Sauce;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.SauceB;

public class NYPizzaIngredientFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        return new DoughA();
    }

    @Override
    public Sauce createSauce() {
        return new SauceB();
    }
}
