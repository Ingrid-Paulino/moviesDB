package com.meli.moviesdb.controller;

import com.meli.moviesdb.model.MoviesBD;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/movies")
public class MoviesController extends GenericController<MoviesBD> {
}
