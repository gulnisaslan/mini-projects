package com.example.application.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.model.GroceryItem;

public interface GroceryRepository extends JpaRepository<GroceryItem,UUID> {
    
}
