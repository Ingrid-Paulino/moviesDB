package com.meli.moviesdb.service;

import com.meli.moviesdb.model.ActorsBD;
import com.meli.moviesdb.repository.IActorsRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ActorsService extends GenericAbstractBaseRepositoryImpl<ActorsBD> implements IActorsService{
    private IActorsRepo actorsRepo;
    public ActorsService(IActorsRepo actorRepo) {
        super(actorRepo);
    }
}
