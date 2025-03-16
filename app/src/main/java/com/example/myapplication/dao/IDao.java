package com.example.myapplication.dao;

public interface IDao<T> {
    void save(T entity);
    T findById(int id);
    void update(T entity);
    void delete(int id);
}
