package com.meli.moviesdb.model;

import java.sql.Timestamp;
import java.util.UUID;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "genres")
public class GenresBD {
    @Id @GeneratedValue
    private UUID id_pk = UUID.randomUUID();
    @Column(nullable = false)
    private Timestamp created_at;
    @Column(nullable = false)
    private Timestamp updated_at;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Double rating;
    // TODO: como mudar Integer para tinyint
    @Column(nullable = false)
    private Integer active;
}
