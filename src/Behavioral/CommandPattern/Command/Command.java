package Behavioral.CommandPattern.Command;

import Behavioral.CommandPattern.Entity.Record;
import Behavioral.CommandPattern.Layer.Cache;

public abstract class Command {

    protected Record body;
    protected Cache cache;

    public Command(Record body, Cache cache) {
        this.body = body;
        this.cache = cache;
    }

    public abstract void execute();

    public abstract void unExecute();

    public Record getBody() {
        return body;
    }

    public void setBody(Record body) {
        this.body = body;
    }

    public Cache getCache() {
        return cache;
    }

    public void setCache(Cache cache) {
        this.cache = cache;
    }
}
