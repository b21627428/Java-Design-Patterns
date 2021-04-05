package AbstractFactoryPattern.Pizza;

import AbstractFactoryPattern.Pizza.Creator.*;

public class CheesePizza extends Pizza{

    PizzaIngredientsFactory ingredientFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare(){
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
