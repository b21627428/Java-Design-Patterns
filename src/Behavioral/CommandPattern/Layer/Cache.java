package Behavioral.CommandPattern.Layer;

import Behavioral.CommandPattern.Entity.Record;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Cache {

    private Map<Long,Record> objects;
    private DataAccessLayer dataAccessLayer;

    public Cache(DataAccessLayer dataAccessLayer) {
        this.objects = new HashMap<>();
        this.dataAccessLayer = dataAccessLayer;
    }

    private final Predicate<Record> isContain = record -> this.objects.containsKey(record.getId());

    public void addObject(Record record) {
        if(!isContain.test(record)) this.objects.put(record.getId(),record);
    }

    public void removeObject(Record record) {
        if(isContain.test(record)) this.objects.remove(record.getId());
    }

    public void updateObject(Record record){
        if(isContain.test(record)) this.objects.put(record.getId(), record);
    }

    public void commit(){
        this.dataAccessLayer.write(objects);
    }

    public Map<Long, Record> getObjects() {
        return objects;
    }

    public void setObjects(Map<Long, Record> objects) {
        this.objects = objects;
    }

    public DataAccessLayer getDataAccessLayer() {
        return dataAccessLayer;
    }

    public void setDataAccessLayer(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }

}
