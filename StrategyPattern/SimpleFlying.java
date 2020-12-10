package StrategyPattern;

public class SimpleFlying implements IBehavior{

    @Override
    public void run() {
        System.out.println("fly");
    }
}
