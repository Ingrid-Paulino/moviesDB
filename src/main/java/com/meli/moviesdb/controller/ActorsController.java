package com.meli.moviesdb.controller;

import com.meli.moviesdb.model.ActorsBD;
import com.meli.moviesdb.service.ActorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // or @Controller
@CrossOrigin
@RequestMapping(value = "/api/actors")
public class ActorsController {
    private final ActorsService service;

    @Autowired
    public ActorsController(ActorsService service) {
        this.service = service;
    }

    @PostMapping("/new")
    public ResponseEntity<ActorsBD> insert(@RequestBody ActorsBD entity) {
        return new ResponseEntity<>(service.save(entity), HttpStatus.CREATED);
    } // http://localhost:8083/api/actors/new
}
