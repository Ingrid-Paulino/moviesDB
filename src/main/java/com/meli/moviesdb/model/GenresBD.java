package com.meli.moviesdb.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "genres")
public class GenresBD extends GenericBaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double ranking;

//TODO: confirir os tipos depois
    @Column(nullable = false)
    private Integer active;
}
