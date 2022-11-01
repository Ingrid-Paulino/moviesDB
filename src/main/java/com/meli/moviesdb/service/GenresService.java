package com.meli.moviesdb.service;

import com.meli.moviesdb.model.GenresBD;
import com.meli.moviesdb.repository.IGenresRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class GenresService extends GenericService<GenresBD> implements IGenresService {
  private IGenresRepo genresRepo;

    public GenresService(IGenresRepo genresRepo) {
        super(genresRepo);
    }
}
