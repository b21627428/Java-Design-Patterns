package StrategyPattern;

public class SimpleQuacking implements IBehavior {

    @Override
    public void run() {
        System.out.println("simple quack");
    }
}
