package com.meli.moviesdb.repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericRepo<M, T> extends JpaRepository< M, T> {
}
