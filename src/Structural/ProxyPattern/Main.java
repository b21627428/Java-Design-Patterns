package Structural.ProxyPattern;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();

        Proxy proxy = new Proxy(service);

        Person said = new Person(1L, "Said");
        proxy.operation(said,"DELETE FROM accounts"); //Bad person

        proxy.authorize(said);
        proxy.operation(said,"DELETE FROM accounts");
    }
}
