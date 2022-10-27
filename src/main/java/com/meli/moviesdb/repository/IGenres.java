package com.meli.moviesdb.repository;
import com.meli.moviesdb.model.ActorsBD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IGenres extends JpaRepository<ActorsBD, UUID> {
}
