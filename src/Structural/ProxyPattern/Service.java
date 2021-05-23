package Structural.ProxyPattern;

public class Service implements ServiceInterface{
    @Override
    public void operation(Person person, String query) {
        System.out.println("SYSTEM INFO: DB query executed: "+query + " ---- by "+person);
    }
}
