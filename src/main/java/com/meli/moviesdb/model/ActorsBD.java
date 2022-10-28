package com.meli.moviesdb.model;

import java.sql.Timestamp;
import java.util.UUID;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Date;

//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "actors")
public class ActorsBD extends GenericBaseEntity {
    //@Id @GeneratedValue
    //private UUID id_pk = UUID.randomUUID();
   // @Column(nullable = false)
    //private Timestamp created_at;
    //@Column(nullable = false)
   // private Timestamp updated_at;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private Double last_name;
    @Column(nullable = false)
    private Double rating;
    @Column
    private Integer favorite_movie_id_fk;
}
