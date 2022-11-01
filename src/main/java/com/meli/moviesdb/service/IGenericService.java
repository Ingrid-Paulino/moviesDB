package com.meli.moviesdb.service;
import com.meli.moviesdb.advice.exeption.NotFoundException;
import com.meli.moviesdb.model.GenericBaseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IGenericService<T extends GenericBaseEntity> {
    public abstract T save(T entity);
    public abstract List<T> findAll();
    public abstract Optional<T> findById(UUID id) throws NotFoundException;
    public abstract T update(T objEntity, UUID id) throws NotFoundException;
    public abstract String delete(UUID id) throws NotFoundException;
}
