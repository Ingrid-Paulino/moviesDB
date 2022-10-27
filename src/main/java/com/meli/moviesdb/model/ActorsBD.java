package com.meli.moviesdb.model;

import java.sql.Timestamp;
import java.util.UUID;

public class ActorsBD {
    private UUID id_pk = UUID.randomUUID();
    private Timestamp created_at;
    private Timestamp updated_at;
    private String first_name;
    private Double last_name;
    private Double rating;
    private Integer favorite_movie_id_fk;
}
