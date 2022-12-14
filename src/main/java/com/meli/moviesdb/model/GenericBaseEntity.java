package com.meli.moviesdb.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class GenericBaseEntity implements Serializable {

    //@Column(columnDefinition = "BINARY(16)")
   // @GeneratedValue(generator = "custom-uuid")
    //@GenericGenerator(
         //   name = "custom-uuid",
         //   strategy = "org.hibernate.id.UUIDGenerator",
         //   parameters = {
           //         @Parameter(
           //                 name = "uuid_gen_strategy_class",
            //               value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
            //        )
           // }
   //)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pk;

    @Column(nullable = false)
    private Timestamp createdAt;
    @Column(nullable = false)
    private Timestamp updatedAt;

    public GenericBaseEntity() {
        this.updatedAt = new Timestamp(new Date().getTime());
    }
}
