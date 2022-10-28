package com.meli.moviesdb.controller;
import com.meli.moviesdb.model.GenericBaseEntity;
import com.meli.moviesdb.repository.IGenericRepo;
import com.meli.moviesdb.service.GenericService;
import com.meli.moviesdb.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<T> save(@RequestBody T entity) {
        return new ResponseEntity(service.save(entity), HttpStatus.CREATED);
    }
}
