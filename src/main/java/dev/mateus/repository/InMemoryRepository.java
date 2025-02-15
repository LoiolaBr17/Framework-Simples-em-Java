package dev.mateus.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class InMemoryRepository<T> implements CrudRepository<T> {
    private final Map<Integer, T> storage = new HashMap<>();
    private int currentId = 1;

    @Override
    public void save(T entity) {
        storage.put(currentId++, entity);
    }

    @Override
    public T findById(int id) {
        return storage.get(id);
    }

    @Override
    public void update(T entity) {
        storage.entrySet().stream()
                .filter(entry -> entry.getValue().equals(entity))
                .findFirst()
                .ifPresent(entry -> storage.put(entry.getKey(), entity));
    }

    @Override
    public void delete(int id) {
        storage.remove(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }
}