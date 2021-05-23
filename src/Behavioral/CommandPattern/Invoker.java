package Behavioral.CommandPattern;

import Behavioral.CommandPattern.Command.Command;
import Behavioral.CommandPattern.Command.CommandCreate;
import Behavioral.CommandPattern.Command.CommandUpdate;
import Behavioral.CommandPattern.Entity.Record;
import Behavioral.CommandPattern.Layer.Cache;
import Behavioral.CommandPattern.Layer.DataAccessLayer;

import java.util.Stack;
import java.util.function.Predicate;

public class Invoker {

    private Stack<Command> executedCommands;
    private Stack<Command> unExecutedCommands;
    private Cache cache;
    private Predicate<Stack<Command>> containsItem;

    public Invoker() {
        this.executedCommands = new Stack<>();
        this.unExecutedCommands = new Stack<>();
        this.cache = new Cache(new DataAccessLayer());
        this.containsItem = stack -> !stack.empty();
    }

    public void execute(Command command) {
        command.execute();
        executedCommands.push(command);
        unExecutedCommands.clear();
    }

    public void undo() {
        if (containsItem.test(this.executedCommands)) {
            Command command = executedCommands.pop();
            command.unExecute();
            unExecutedCommands.push(command);
        }
    }

    public void redo() {
        if (containsItem.test(this.unExecutedCommands)) {
            Command command = this.unExecutedCommands.pop();
            command.execute();
            this.executedCommands.push(command);
        }
    }

    public void commit() {
        this.cache.commit();
    }

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Record record = new Record(1L, "Said");

        invoker.execute(new CommandCreate(record, invoker.cache));
        invoker.commit();

        invoker.undo();
        invoker.commit();

        invoker.redo();
        invoker.commit();

        invoker.execute(new CommandUpdate(record, new Record(1L, "Kaya"), invoker.cache));
        invoker.commit();

        invoker.undo();
        invoker.commit();
    }
}
