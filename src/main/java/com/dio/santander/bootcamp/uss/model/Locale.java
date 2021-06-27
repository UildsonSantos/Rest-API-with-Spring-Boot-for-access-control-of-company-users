package com.dio.santander.bootcamp.uss.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Locale {

    @Id
    private Long id;
    private String description;
    @ManyToOne
    private AccessLevel accessLevel;
}
