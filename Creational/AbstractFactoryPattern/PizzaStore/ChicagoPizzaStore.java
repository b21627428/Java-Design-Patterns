package AbstractFactoryPattern.PizzaStore;

import AbstractFactoryPattern.Pizza.*;
import AbstractFactoryPattern.Pizza.Creator.*;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
        super(new ChicagoPizzaIngredientFactory());
        // TODO Auto-generated constructor stub
    }

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Chicago Cheese Pizza");
        }
        return pizza;
    } 
}
