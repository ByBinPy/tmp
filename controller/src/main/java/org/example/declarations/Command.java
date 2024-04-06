package org.example.declarations;

public interface Command<T> {
    public T execute(Service<T> service);
}
