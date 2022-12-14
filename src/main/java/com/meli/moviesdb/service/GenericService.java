package com.meli.moviesdb.service;

import com.meli.moviesdb.advice.exeption.NotFoundException;
import com.meli.moviesdb.model.GenericBaseEntity;
import com.meli.moviesdb.repository.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public abstract class GenericService<T extends GenericBaseEntity>
        implements IGenericService<T> {
    protected UUID uuid;

    private IGenericRepo<T> genericRepo;

    @Autowired
    public GenericService(IGenericRepo<T> abstractBaseRepository) {
        this.genericRepo = abstractBaseRepository;
    }

    @Override
    public T save(T entity) {
        entity.setCreatedAt(new Timestamp(new Date().getTime()));
        return (T) genericRepo.save(entity);
    }

    @Override
    public List<T> findAll() {
        return genericRepo.findAll();
    }

    @Override
    public Optional<T> findById(Long id) throws NotFoundException {
        List<T> existObj = findAll().stream()
                .filter(obj -> obj.getId_pk().equals(id))
                .collect(Collectors.toList());

        if (existObj.isEmpty())
            throw new NotFoundException("Registro não Encontrado");

        return genericRepo.findById(id);
        // or return genericRepo.findById(id).orElse(null);
    }

    @Override
    public T update(T objEntity, Long id) throws NotFoundException {
        var obj = findById(id);
        objEntity.setUpdatedAt(new Timestamp(new Date().getTime()));
        objEntity.setCreatedAt(obj.get().getCreatedAt());
        objEntity.setId_pk(id);
        return genericRepo.save(objEntity);
    }

    @Override
    public String delete(Long id) throws NotFoundException {
        findById(id);
        genericRepo.deleteById(id);
        return "Deletado com sucesso!";
    }
}