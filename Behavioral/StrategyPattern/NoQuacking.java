package StrategyPattern;

public class NoQuacking implements IBehavior {

    @Override
    public void run() {
        System.out.println("no quack");
    }
}
