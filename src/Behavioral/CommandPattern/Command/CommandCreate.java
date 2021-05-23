package Behavioral.CommandPattern.Command;

import Behavioral.CommandPattern.Entity.Record;
import Behavioral.CommandPattern.Layer.Cache;

public class CommandCreate extends Command{

    public CommandCreate(Record body, Cache cache) {
        super(body, cache);
    }

    @Override
    public void execute() {
        this.getCache().addObject(this.getBody());
    }

    @Override
    public void unExecute() {
        this.getCache().removeObject(this.getBody());
    }
}
