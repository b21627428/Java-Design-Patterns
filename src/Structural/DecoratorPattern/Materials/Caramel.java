package Structural.DecoratorPattern.Materials;


import Structural.DecoratorPattern.AddonDecorator;
import Structural.DecoratorPattern.Beverage;

public class Caramel extends AddonDecorator {

    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+3;
    }

    @Override
    public String desc() {
        return this.beverage.desc()+" Caramel";
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
