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
@Table(name = "actors")
public class ActorsBD extends GenericBaseEntity {
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private String first_name;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private String last_name;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Double rating;

    //@Column(nullable = false)
    //@NotNull(message = "O campo não pode ser nulo")
    //private Integer favorite_movie_id_fk;

    @ManyToMany
    @JoinTable(
            name = "actor_movie", //nome da tabela
            joinColumns = @JoinColumn(name = "id_actor", referencedColumnName = "id_pk"), //Atributo que vai aparecer na tabela/ nome da coluna
            inverseJoinColumns = @JoinColumn(name = "id_movie", referencedColumnName = "id_pk")
    )
    //@JsonIgnore
    @JsonIgnoreProperties("actors")
    //Com o set 1 filme so pode aparecer com um ator e um ator com um filme, não pode haver repetição
    private Set<MoviesBD> movies;
}
