package AbstractFactoryPattern.Pizza.Creator;

import AbstractFactoryPattern.Pizza.Products.*;


public interface PizzaIngredientsFactory {

    public Dough createDough();

    public Sauce createSauce();
}
