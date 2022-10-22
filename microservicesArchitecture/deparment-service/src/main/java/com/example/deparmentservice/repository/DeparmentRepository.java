package com.example.deparmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.deparmentservice.entity.Deparment;

@Repository
public interface DeparmentRepository extends JpaRepository<Deparment,Long>{
    
}
