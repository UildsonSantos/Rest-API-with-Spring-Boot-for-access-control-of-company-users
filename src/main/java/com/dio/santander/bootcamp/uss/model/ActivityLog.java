package com.dio.santander.bootcamp.uss.model;

import lombok.*;

import javax.persistence.*;
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
public class ActivityLog {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class ActivityLogId implements Serializable {
        private Long idActivityLog;
        private Long idUser;
    }

    @EmbeddedId
    private ActivityLogId activityLogId;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate;
    private BigDecimal activityPeriod;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
