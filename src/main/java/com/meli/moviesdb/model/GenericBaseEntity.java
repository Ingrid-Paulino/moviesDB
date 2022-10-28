package com.meli.moviesdb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class GenericBaseEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column
    private UUID id_pk = UUID.randomUUID();
    @Column(nullable = false)
    @Version
    private int version;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public GenericBaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
