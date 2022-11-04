package com.meli.moviesdb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    // Retorna um array de movies quando busto todos os generos ou 1 genero especifico
    @OneToMany(mappedBy = "id_genres_fk") // 1 genero tem varios filmes
    @JsonIgnoreProperties("id_genres_fk")
    @JsonIgnore
    private List<MoviesBD> movies;


}
