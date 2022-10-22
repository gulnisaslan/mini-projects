package com.example.userservice.Service;

import com.example.userservice.Entity.User;
import com.example.userservice.VO.ResponseTemplate;

/**
 * UserService
 */
public interface UserService {

  

    User save(User user);

    ResponseTemplate getUserWithDeparmentId(Long userId);

    
}