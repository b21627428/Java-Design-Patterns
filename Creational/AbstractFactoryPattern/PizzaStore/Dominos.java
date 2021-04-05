package AbstractFactoryPattern.PizzaStore;

import AbstractFactoryPattern.Pizza.*;
import AbstractFactoryPattern.Pizza.Creator.*;

public class Dominos extends PizzaStore{

    public Dominos() {
        super(new DominosIngredientsFactory());
        //TODO Auto-generated constructor stub
    }


    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("Dominos Cheese Pizza");
        }
        return pizza;
    }
}
