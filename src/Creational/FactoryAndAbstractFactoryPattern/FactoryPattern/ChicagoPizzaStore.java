package Creational.FactoryAndAbstractFactoryPattern.FactoryPattern;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.CheesePizza;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Creators.PizzaIngredientsFactory;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore(PizzaIngredientsFactory pizzaIngredientsFactory) {
        super(pizzaIngredientsFactory);
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(this.pizzaIngredientsFactory);
            pizza.setName("Chicago Cheese Pizza");
        }
        return pizza;
    }
}
