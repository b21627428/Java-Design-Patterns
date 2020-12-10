package StrategyPattern;

public class NoFlying implements IBehavior {

    @Override
    public void run() {
        System.out.println("no fly");
    }
}
