package com.meli.moviesdb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "movies")
public class MoviesBD extends GenericBaseEntity {
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private String title;
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Double rating;
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer awards;
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    //TODO como colocar o tipo timestamp e datetime
    //ToDO: mudar o tipo https://blog.cvinicius.com.br/2018/08/utilizando-localdate-localdatetime-e.html
    //@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    //@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    //private LocalDate release_date;
    private String release_date;
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer length;
    @Column(nullable = false)
    @NotNull(message = "O campo não pode ser nulo")
    private Integer genre_id_fk;
}