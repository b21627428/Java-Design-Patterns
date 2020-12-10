package StrategyPattern;

public class Duck {

    private IBehavior flyingBehavior;
    private IBehavior quackingBehavior;

    public Duck(IBehavior flyingBehavior, IBehavior quackingBehavior) {
        this.flyingBehavior = flyingBehavior;
        this.quackingBehavior = quackingBehavior;
    }

    public void fly(){
        this.flyingBehavior.run();
    }
    public void quack(){
        this.quackingBehavior.run();
    }

    public IBehavior getFlyingBehavior() {
        return flyingBehavior;
    }

    public void setFlyingBehavior(IBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public IBehavior getQuackingBehavior() {
        return quackingBehavior;
    }

    public void setQuackingBehavior(IBehavior quackingBehavior) {
        this.quackingBehavior = quackingBehavior;
    }
}
