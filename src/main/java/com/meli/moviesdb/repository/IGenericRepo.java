package com.meli.moviesdb.repository;

import com.meli.moviesdb.model.GenericBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//https://stackoverflow.com/questions/19417670/using-generics-in-spring-data-jpa-repositories
@Repository
@NoRepositoryBean //para que o JPA não tente encontrar uma implementação para o repositório!
public interface IGenericRepo<T extends GenericBaseEntity> extends JpaRepository<T, UUID> {
}
