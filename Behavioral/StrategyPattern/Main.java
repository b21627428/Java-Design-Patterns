package StrategyPattern;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck(new SimpleFlying(), new NoQuacking());
        duck.quack();
    }
}
