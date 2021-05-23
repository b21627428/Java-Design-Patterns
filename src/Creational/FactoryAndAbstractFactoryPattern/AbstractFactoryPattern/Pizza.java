package Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern;

import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Dough;
import Creational.FactoryAndAbstractFactoryPattern.AbstractFactoryPattern.Products.Sauce;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                '}';
    }
}
