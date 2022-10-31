package com.meli.moviesdb.service;

import com.meli.moviesdb.model.GenericBaseEntity;
import com.meli.moviesdb.repository.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
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
        return (T) genericRepo.save(entity);
    }

    @Override
    public List<T> findAll() {
        return genericRepo.findAll();
    }

    @Override
    public Optional<T> findById(UUID id) {
        //System.out.println("CONSOLE:" + id.getClass()); // retorna o tipo do id
        //uuid = UUID.fromString(id);
        List<T> existObj = findAll().stream()
                .filter(obj -> obj.getId_pk().equals(id))
                .collect(Collectors.toList());
        System.out.println("aaa: " + existObj.size());

        if (existObj.isEmpty())
            throw new RuntimeException("falhou!!");

        return genericRepo.findById(id);
    }
}