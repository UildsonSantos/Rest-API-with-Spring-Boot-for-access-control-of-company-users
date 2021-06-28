package com.dio.santander.bootcamp.uss.controller;


import com.dio.santander.bootcamp.uss.model.WorkingHours;
import com.dio.santander.bootcamp.uss.service.WorkingHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/workinghours")
public class WorkingHoursController {

    @Autowired
    WorkingHoursService workingHoursService;

    @PostMapping
    public WorkingHours createWorkingHours(@RequestBody WorkingHours workingHours) {
        return workingHoursService.save(workingHours);
    }

    @GetMapping
    public List<WorkingHours> getWorkingHoursList(){
        return workingHoursService.findAll();

    }

    @GetMapping("/{idWorkingHours}")
    public ResponseEntity<WorkingHours>  getWorkingHours(@PathVariable("idWorkingHours") Long idWorkingHours) throws Exception {
        return  ResponseEntity.ok(workingHoursService.getById(idWorkingHours).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping("/{idWorkingHours}")
    public ResponseEntity updateWorkingHours( @PathVariable("idWorkingHours") Long idWorkingHours, @RequestBody WorkingHours workingHours){
        return workingHoursService.updateWorkingHours(idWorkingHours, workingHours);
    }

    @DeleteMapping("/{idWorkingHours}")
    public ResponseEntity deleteByID(@PathVariable("idWorkingHours") Long idWorkingHours) throws Exception {
        try {
            workingHoursService.deleteWorkingHours(idWorkingHours);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkingHours>) ResponseEntity.ok();
    }
}
