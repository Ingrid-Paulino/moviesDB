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

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer genre_id_fk;
}