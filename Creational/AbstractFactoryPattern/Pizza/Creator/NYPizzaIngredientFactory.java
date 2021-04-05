package AbstractFactoryPattern.Pizza.Creator;

import AbstractFactoryPattern.Pizza.Products.*;


public class NYPizzaIngredientFactory implements PizzaIngredientsFactory {

    @Override
    public Dough createDough() {
        // TODO Auto-generated method stub
        return new DoughA();
    }

    @Override
    public Sauce createSauce() {
        // TODO Auto-generated method stub
        return new SauceB();
    }
}
