package com.meli.moviesdb.service;

import com.meli.moviesdb.model.MoviesBD;
import com.meli.moviesdb.repository.IGenericRepo;
import com.meli.moviesdb.repository.IMoviesRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MoviesService extends GenericService<MoviesBD> implements IMoviesService {
    private IMoviesRepo moviesRepo;

    public MoviesService(IMoviesRepo moviesRepo) {
        super(moviesRepo);
    }
}
