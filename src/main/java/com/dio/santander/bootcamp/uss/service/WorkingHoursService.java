package com.dio.santander.bootcamp.uss.service;


import com.dio.santander.bootcamp.uss.model.WorkingHours;
import com.dio.santander.bootcamp.uss.repository.WorkingHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingHoursService {

    @Autowired
    WorkingHoursRepository workingHoursRepository;

    public WorkingHours save(WorkingHours workingHours){
        return workingHoursRepository.save(workingHours);
    }

    public WorkingHours saveWorkingHours(WorkingHours workingHours){
        return workingHoursRepository.save(workingHours);
    }

    public List<WorkingHours> findAll() {
        return   workingHoursRepository.findAll();
    }

    public Optional<WorkingHours> getById(Long idWorkingHours) {
        return workingHoursRepository.findById(idWorkingHours);
    }

    public ResponseEntity updateWorkingHours(Long idWorkingHours, WorkingHours workingHours){
        return workingHoursRepository.findById(idWorkingHours)
                .map(record -> {
                    record.setDescription((workingHours.getDescription()));

                    WorkingHours updated = workingHoursRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    public void deleteWorkingHours(Long idWorkingHours) {
        workingHoursRepository.deleteById(idWorkingHours);
    }
}
