package Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Dough;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Sauce;

public interface PizzaIngredientsFactory {

    Dough createDough();

    Sauce createSauce();
}
