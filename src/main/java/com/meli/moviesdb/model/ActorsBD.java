package com.meli.moviesdb.model;

import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "actors")
public class ActorsBD extends GenericBaseEntity {
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private Double rating;
    @Column(nullable = false)
    private Integer favorite_movie_id_fk;
}
