package com.meli.moviesdb.model;

import java.sql.Timestamp;
import java.util.UUID;

public class Genres {
    private UUID id_pk = UUID.randomUUID();
    private Timestamp created_at;
    private Timestamp updated_at;
    private String name;
    private Double rating;
    // TODO: como mudar Integer para tinyint
    private Integer active;
}
