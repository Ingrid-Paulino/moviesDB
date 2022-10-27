package com.meli.moviesdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

//https://stackoverflow.com/questions/19417670/using-generics-in-spring-data-jpa-repositories

@NoRepositoryBean //para que o JPA não tente encontrar uma implementação para o repositório!
public interface IGenericRepo<T> extends JpaRepository<T, UUID> {
}
