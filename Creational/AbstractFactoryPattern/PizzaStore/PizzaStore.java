package AbstractFactoryPattern.PizzaStore;

import AbstractFactoryPattern.Pizza.*;
import AbstractFactoryPattern.Pizza.Creator.*;

public abstract class PizzaStore {
    
    protected PizzaIngredientsFactory ingredientsFactory;

    public PizzaStore(PizzaIngredientsFactory ingredientsFactory){
        this.ingredientsFactory = ingredientsFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
