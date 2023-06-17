package com.deparment.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deparment.service.entity.Deparment;

public interface DeparmentRepository extends JpaRepository<Deparment,Long> {

    Deparment findByDeparmentId(Long deparmentId);
    
}
