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
@Table(name = "movies")
public class MoviesBD {
    // TODO: como mudar string para varchar e timestamp para datetime
    @Id @GeneratedValue
    private UUID id_pk = UUID.randomUUID();
    @Column(nullable = false)
    private Timestamp created_at;
    @Column(nullable = false)
    private Timestamp updated_at;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Double rating;
    @Column(nullable = false)
    private Integer awards;
    @Column(nullable = false)
    private Timestamp release_date;
    @Column(nullable = false)
    private Integer length;
    @Column(nullable = false)
    private Integer genre_id_fk;
}
