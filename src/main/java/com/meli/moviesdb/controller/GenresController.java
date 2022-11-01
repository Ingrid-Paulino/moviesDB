package com.meli.moviesdb.controller;

import com.meli.moviesdb.model.GenresBD;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/genres")
public class GenresController extends GenericController<GenresBD> implements IGenresController {
}
