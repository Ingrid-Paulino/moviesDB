package com.meli.moviesdb.repository;

import com.meli.moviesdb.model.MoviesBD;
import org.springframework.stereotype.Repository;

@Repository
public interface IMoviesRepo extends IGenericRepo<MoviesBD>  {
}
