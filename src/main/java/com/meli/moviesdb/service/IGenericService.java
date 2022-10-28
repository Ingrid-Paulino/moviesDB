package com.meli.moviesdb.service;
import com.meli.moviesdb.model.GenericBaseEntity;

import java.util.List;

public interface IGenericService<T extends GenericBaseEntity> {
    public abstract T save(T entity);
    public abstract List<T> findAll();
    //public abstract Optional<T> findById(UUID id);
    //public abstract T update(T objEntity, UUID id);
    //public abstract void delete(UUID id);
}
