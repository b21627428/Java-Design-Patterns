package AbstractFactoryPattern.PizzaStore;

import AbstractFactoryPattern.Pizza.*;
import AbstractFactoryPattern.Pizza.Creator.*;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {
        super(new NYPizzaIngredientFactory());
        // TODO Auto-generated constructor stub
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("NY Cheese Pizza");
        }
        return pizza;
    }

}
