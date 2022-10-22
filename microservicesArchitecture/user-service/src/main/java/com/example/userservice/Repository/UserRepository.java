package com.example.userservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userservice.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserId(Long userId);
    
}
