package com.meli.moviesdb.controller;

import com.meli.moviesdb.model.GenericBaseEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IGenericController<T extends GenericBaseEntity> {
    public abstract ResponseEntity<T> save(T entity);
    public abstract ResponseEntity<List<T>> findAll();
    public abstract ResponseEntity<Optional<T>> findById(UUID id);
    public abstract ResponseEntity<T> update(T objEntity, UUID id);
    public abstract ResponseEntity<String> delete(UUID id);
}
