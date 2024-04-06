package org.example.impl.controllers;

import org.example.declarations.Command;
import org.example.declarations.Service;

public class GetByIdCommand<T> implements Command<T> {
    private final Long id;
    public GetByIdCommand(Long id) {
        this.id = id;
    }
    @Override
    public T execute(Service<T> service) {
        return service.getById(id);
    }
}
