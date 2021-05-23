package Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators.PizzaIngredientsFactory;

public class CheesePizza extends Pizza{

    private PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    public void prepare() {
        this.dough = pizzaIngredientsFactory.createDough();
        this.sauce = pizzaIngredientsFactory.createSauce();
    }
}
