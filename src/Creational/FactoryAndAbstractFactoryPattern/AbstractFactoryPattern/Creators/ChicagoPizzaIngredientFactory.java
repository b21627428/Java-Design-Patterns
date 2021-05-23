package Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Dough;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.DoughB;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Sauce;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.SauceA;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        return new DoughB();
    }

    @Override
    public Sauce createSauce() {
        return new SauceA();
    }
}
