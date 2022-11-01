package com.meli.moviesdb.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "genres")
public class GenresBD extends GenericBaseEntity {
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private String name;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Double ranking;

    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer active;
}
