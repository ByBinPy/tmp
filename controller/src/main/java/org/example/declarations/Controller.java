package org.example.declarations;

public abstract class Controller<T> {
    private final Service<T> service;

    protected Controller(Service<T> service) {
        this.service = service;
    }

    public T handleCommand(Command<T> command) {
        return command.execute(service);
    }
}