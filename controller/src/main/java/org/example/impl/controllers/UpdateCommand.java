package org.example.impl.controllers;

import org.example.declarations.Command;
import org.example.declarations.Service;

public class UpdateCommand<T> implements Command<T> {
    private final T entity;

    public UpdateCommand(T entity) {
        this.entity = entity;
    }

    @Override
    public T execute(Service<T> service) {
        return service.update(entity);
    }
}
