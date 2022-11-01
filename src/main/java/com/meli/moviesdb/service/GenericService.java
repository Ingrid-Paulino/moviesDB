package com.meli.moviesdb.service;

import com.meli.moviesdb.advice.exeption.NotFoundException;
import com.meli.moviesdb.model.GenericBaseEntity;
import com.meli.moviesdb.repository.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public abstract class GenericService<T extends GenericBaseEntity>
        implements IGenericService<T> {
    private UUID uuid;
    private IGenericRepo<T> genericRepo;

    @Autowired
    public GenericService(IGenericRepo<T> abstractBaseRepository) {
        this.genericRepo = abstractBaseRepository;
    }

    @Override
    public T save(T entity) {
        entity.setCreatedAt(LocalDateTime.now());
        return (T) genericRepo.save(entity);
    }

    @Override
    public List<T> findAll() {
        return genericRepo.findAll();
    }

    @Override
    public Optional<T> findById(UUID id) throws NotFoundException {
        List<T> existObj = findAll().stream()
                .filter(obj -> obj.getId_pk().equals(id))
                .collect(Collectors.toList());

        if (existObj.isEmpty())
            throw new NotFoundException("Registro não Encontrado");

        return genericRepo.findById(id);
    }

    @Override
    public T update(T objEntity, UUID id) throws NotFoundException {
        var obj = findById(id);
        objEntity.setUpdatedAt(LocalDateTime.now());
        objEntity.setCreatedAt(obj.get().getCreatedAt());
        objEntity.setId_pk(id);
        return genericRepo.save(objEntity);
    }

    @Override
    public String delete(UUID id) throws NotFoundException {
        findById(id);
        genericRepo.deleteById(id);
        return "Deletado com sucesso!";
    }
}