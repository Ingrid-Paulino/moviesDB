package com.meli.moviesdb.controller;

import com.meli.moviesdb.model.GenericBaseEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGenericController<T extends GenericBaseEntity> {
    public abstract ResponseEntity<T> save(T entity);
    public abstract ResponseEntity<List<T>> findAll();
}
