package com.meli.moviesdb.repository;
import com.meli.moviesdb.model.ActorsBD;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@EntityScan(basePackages = {"com.meli.moviesdb.model"})
public interface IActors extends JpaRepository<ActorsBD, UUID> {
}
