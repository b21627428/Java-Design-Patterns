package Behavioral.CommandPattern.Command;

import Behavioral.CommandPattern.Entity.Record;
import Behavioral.CommandPattern.Layer.Cache;

public class CommandUpdate extends Command {

    private final Record newVersionBody;

    public CommandUpdate(Record oldVersionBody, Record newVersionBody, Cache cache) {
        super(oldVersionBody, cache);
        this.newVersionBody = newVersionBody;
    }

    @Override
    public void execute() {
        this.getCache().updateObject(this.newVersionBody);
    }

    @Override
    public void unExecute() {
        this.getCache().updateObject(this.getBody());
    }
}
