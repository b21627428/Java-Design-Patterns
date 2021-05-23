package Structural.AdapterPattern.Adapter;

import Structural.AdapterPattern.Adaptee.GeometricShape;
import Structural.AdapterPattern.Adaptee.Triangle;
import Structural.AdapterPattern.Shapes.Shape;

public class GeometricShapeAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        this.adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle object";
        } else {
            return "Unknown object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
