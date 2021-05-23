package Creational.FactoryAndAbstractFactoryPattern.FactoryPattern;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators.PizzaIngredientsFactory;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Pizza;

public abstract class PizzaStore {

    protected PizzaIngredientsFactory pizzaIngredientsFactory;

    public PizzaStore(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
