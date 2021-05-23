package Behavioral.CommandPattern.Layer;

import Behavioral.CommandPattern.Entity.Record;

import java.util.Map;
import java.util.function.Consumer;

public class DataAccessLayer {

    public void write(Map<Long,Record> objects) {
        Consumer<Map.Entry<Long,Record>> print = System.out::println;
        objects.entrySet().forEach(print);
    }
}
