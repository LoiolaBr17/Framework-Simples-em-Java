package dev.mateus.repository;

public interface CrudRepository<T> {
    void save(T entity);
    T findById(int id);
    void update(T entity);
    void delete(int id);
    List<T> findAll();
}