package com.example.deparmentservice.service.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.example.deparmentservice.entity.Deparment;
import com.example.deparmentservice.repository.DeparmentRepository;
import com.example.deparmentservice.service.DeparmentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DeparmentServiceImpl implements DeparmentService{

    private final DeparmentRepository deparmentRepository;
    public DeparmentServiceImpl(DeparmentRepository deparmentRepository) {
        this.deparmentRepository = deparmentRepository;
    }
    @Override
    public Deparment saveDeparment(Deparment deparment) {
        // TODO Auto-generated method stub
        log.info("Inside saveDeparment of DeparmentServiceImpl");
        return this.deparmentRepository.save(deparment);
    }
    @Override
    public Deparment getByDeparmentId(Long deparmentId) {
        // TODO Auto-generated method stub
        log.info("Inside getByDeparmentId of DeparmentServiceImpl Method");
        return this.deparmentRepository.findById(deparmentId).orElseThrow(()->new EntityNotFoundException("Deparment not found id") );
    }
    
}
