package com.meli.moviesdb.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IGenericService<T> {
    public abstract T insert(T objEntity);
    public abstract List<T> findAll();
    public abstract Optional<T> findById(UUID id);
    public abstract T update(T objEntity, UUID id);
    public abstract void delete(UUID id);
}
