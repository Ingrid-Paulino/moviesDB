package com.meli.moviesdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies")
public class MoviesBD extends GenericBaseEntity {
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private String title;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Double rating;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer awards;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private String release_date;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer length;

// Relacionamento 1 pra varios
    @ManyToOne // varios filmes tem um genero
    @JoinColumn(name = "id_genres_fk") //O nome da coluna
    @JsonIgnoreProperties("movies") // ao buscar genero, não quero q traga a lista de filmes
    //@JsonIgnore
   private GenresBD id_genres_fk;

// Set não permite repetição de actors, nn me permite colocar coisas duplicadas
    @ManyToMany(mappedBy = "movies")
    @JsonIgnoreProperties("movies")
    //@JsonIgnore
    private Set<ActorsBD> actors;
}