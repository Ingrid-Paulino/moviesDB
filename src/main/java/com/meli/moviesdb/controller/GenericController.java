package com.meli.moviesdb.controller;
import com.meli.moviesdb.advice.exeption.NotFoundException;
import com.meli.moviesdb.model.GenericBaseEntity;
import com.meli.moviesdb.service.GenericService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController // or @Controller
public abstract class GenericController<T extends GenericBaseEntity> implements IGenericController<T> {
    @Autowired
    private GenericService<T> service;

    @Override
    @GetMapping
    public ResponseEntity<List<T>> findAll() {
            return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }

    @Override
    @PostMapping("/new")
    public ResponseEntity<T> save(@Valid @RequestBody T entity) {
        return new ResponseEntity(service.save(entity), HttpStatus.CREATED);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Optional<T>> findById(@PathVariable("id") UUID  id) throws NotFoundException {
        Optional<T> entity = service.findById(id);
        return new ResponseEntity(entity, HttpStatus.OK);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<T> update(@Valid @RequestBody T objEntity, @PathVariable("id") UUID  id) throws NotFoundException {
        T entity = service.update(objEntity, id);
        return new ResponseEntity(entity, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete( @PathVariable("id") UUID  id) throws NotFoundException {
        String res = service.delete(id);
        return new ResponseEntity(res, HttpStatus.OK);
    }
}
