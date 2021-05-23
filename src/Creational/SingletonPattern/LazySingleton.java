package Creational.SingletonPattern;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton of() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }

}
