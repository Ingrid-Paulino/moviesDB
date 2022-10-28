package com.meli.moviesdb.service;

import com.meli.moviesdb.model.GenericBaseEntity;
import com.meli.moviesdb.repository.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public abstract class GenericService<T extends GenericBaseEntity>
        implements IGenericService<T>{

    private IGenericRepo<T> genericRepo;

    @Autowired
       public GenericService(IGenericRepo<T> abstractBaseRepository) {
         this.genericRepo = abstractBaseRepository;
       }

    @Override
      public T save(T entity) {
        return (T) genericRepo.save(entity);
    }
}