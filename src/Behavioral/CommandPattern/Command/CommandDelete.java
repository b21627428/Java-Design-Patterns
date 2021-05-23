package Behavioral.CommandPattern.Command;

import Behavioral.CommandPattern.Entity.Record;
import Behavioral.CommandPattern.Layer.Cache;

public class CommandDelete extends Command{

    public CommandDelete(Record body, Cache cache) {
        super(body, cache);
    }

    @Override
    public void execute() {
        this.getCache().removeObject(this.getBody());
    }

    @Override
    public void unExecute() {
        this.getCache().addObject(this.getBody());
    }
}
