package com.dio.santander.bootcamp.uss.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {
    @Id
    private Long id;
    private String name;
    private BigDecimal tolerance;
    private LocalDateTime startWorkingHours;
    private LocalDateTime endWorkingHours;

    @ManyToOne
    private UserCategory userCategory;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkingHours workingHours;
}
