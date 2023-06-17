package com.deparment.service.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.deparment.service.entity.Deparment;
import com.deparment.service.repository.DeparmentRepository;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DeparmentService {
    private final DeparmentRepository deparmentRepository;

    public DeparmentService(DeparmentRepository deparmentRepository) {
        this.deparmentRepository = deparmentRepository;
    }

    public Deparment saveDeparment(Deparment deparment) {
        log.info("Inside saveDeparment method of DeparmentService");
        return deparmentRepository.save(deparment);
    }

    public Deparment findDeparmentById(Long deparmentId) {
        log.info("Inside findDeparmentById method of DeparmentService");
        return deparmentRepository.findByDeparmentId(deparmentId);
    }
}
