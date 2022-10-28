package com.meli.moviesdb.controller;

import com.meli.moviesdb.model.ActorsBD;
import org.springframework.web.bind.annotation.*;

@RestController // or @Controller
@RequestMapping(value = "/api/actors")
public class ActorsController extends GenericController<ActorsBD> implements IActorController { }
