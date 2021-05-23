package Structural.AdapterPattern;

import Structural.AdapterPattern.Adaptee.Triangle;
import Structural.AdapterPattern.Adapter.GeometricShapeAdapter;
import Structural.AdapterPattern.Shapes.Rectangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new GeometricShapeAdapter(new Triangle()));

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }
}
