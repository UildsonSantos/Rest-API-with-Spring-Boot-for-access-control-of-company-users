package com.dio.santander.bootcamp.uss.repository;

import com.dio.santander.bootcamp.uss.model.WorkingHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingHoursRepository extends JpaRepository<WorkingHours, Long> {
}
