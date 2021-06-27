package com.dio.santander.bootcamp.uss.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BankOfHours {
    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class BankOfHoursId implements Serializable {
        private Long idBankOfHoursId;
        private Long idActivityLog;
        private Long idUser;
    }

    @EmbeddedId
    private BankOfHoursId bankOfHoursId;
    private LocalDateTime dateWorked;
    private BigDecimal amountOfHours;
    private BigDecimal hoursBalance;
}
