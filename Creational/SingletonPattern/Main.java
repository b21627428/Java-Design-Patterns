package SingletonPattern;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(EagerSingleton.of());
        System.out.println(EagerSingleton.of());
        System.out.println(LazySingleton.of());
        System.out.println(LazySingleton.of());
    }
}
