package com.meli.moviesdb.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer favorite_movie_id_fk;
}
