package com.example.deparmentservice.service;

import com.example.deparmentservice.entity.Deparment;

/**
 * DeparmentService
 */
public interface DeparmentService {

    Deparment saveDeparment(Deparment deparment);

    Deparment getByDeparmentId(Long deparmentId);

    
}