package com.dio.santander.bootcamp.uss.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class UserCategory {
    @Id
    private Long id;
    private String description;
}
