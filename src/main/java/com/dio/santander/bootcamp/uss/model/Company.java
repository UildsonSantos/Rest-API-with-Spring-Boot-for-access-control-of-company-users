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
public class Company {

    @Id
    private Long id;
    private String description;
    private String CNPJ;
    private String address;
    private String district;
    private String city;
    private String state;
    private String telephone;
}
