package Behavioral.TemplateMethodPattern;

public abstract class AbstractClass {

    public void templateMethod() {
        step1();
        if(step2()){
            step3();
        }else{
            step4();
        }
    }

    public void step1() {
        System.out.println("Step1 abstract class");
    }

    public boolean step2() {
        System.out.println("Step2 abstract class");
        return true;
    }

    public void step3() {
        System.out.println("Step3 abstract class");
    }

    public void step4() {
        System.out.println("Step4 abstract class");
    }
}
