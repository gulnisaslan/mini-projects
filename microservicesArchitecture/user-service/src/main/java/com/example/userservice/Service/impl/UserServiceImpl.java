package com.example.userservice.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.userservice.Entity.User;
import com.example.userservice.Repository.UserRepository;
import com.example.userservice.Service.UserService;
import com.example.userservice.VO.Deparment;
import com.example.userservice.VO.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;




    @Autowired
    public UserServiceImpl(UserRepository userRepository, RestTemplate restTemplate) {
        this.userRepository = userRepository;
        this.restTemplate = restTemplate;
    }


    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        return this.userRepository.save(user);
    }


    /* (non-Javadoc)
     * @see com.example.userservice.Service.UserService#getUserWithDeparmentId(java.lang.Long)
     */
    @Override
    public ResponseTemplate getUserWithDeparmentId(Long userId) {
        ResponseTemplate responseTemplate  = new ResponseTemplate();
        User user   =  this.userRepository.findByUserId(userId);
        Deparment  deparment =  restTemplate.getForObject("http://localhost:9001/api/deparment/"+user.getDeparmentId(),Deparment.class);
       responseTemplate.setUser(user);
       responseTemplate.setDeparment(deparment);
        return responseTemplate;
    }
    
}
