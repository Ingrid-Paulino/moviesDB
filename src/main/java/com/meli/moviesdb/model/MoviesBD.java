package com.meli.moviesdb.model;

import java.sql.Timestamp;
import java.util.UUID;

public class MoviesBD {
    // TODO: como mudar string para varchar e timestamp para datetime
    private UUID id_pk = UUID.randomUUID();
    private Timestamp created_at;
    private Timestamp updated_at;
    private String title;
    private Double rating;
    private Integer awards;
    private Timestamp release_date;
    private Integer length;
    private Integer genre_id_fk;
}
