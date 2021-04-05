package AbstractFactoryPattern.Pizza.Creator;

import AbstractFactoryPattern.Pizza.Products.*;

public class DominosIngredientsFactory implements PizzaIngredientsFactory{

    @Override
    public Dough createDough() {
        // TODO Auto-generated method stub
        return new DougbB();
    }

    @Override
    public Sauce createSauce() {
        // TODO Auto-generated method stub
        return new SauceA();
    }

}
