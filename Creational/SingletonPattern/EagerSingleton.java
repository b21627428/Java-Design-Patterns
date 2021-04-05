package SingletonPattern;

public class EagerSingleton {
    
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton of(){
        return instance;
    }
}
