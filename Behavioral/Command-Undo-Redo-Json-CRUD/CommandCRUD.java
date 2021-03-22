public abstract class CommandCRUD {

    protected Block parameter;
    protected Middleware middleware;

    public CommandCRUD(Block parameter, Middleware middleware) {
        this.parameter = parameter;
        this.middleware = middleware;
    }
    
    public abstract void execute();
    public abstract void unexecute();

    public Block getParameter() {
        return parameter;
    }

    public void setParameter(Block parameter) {
        this.parameter = parameter;
    }

    public Middleware getMiddleware() {
        return middleware;
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
}
