package com.example.userservice.VO;

import com.example.userservice.Entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
    private User user;
    private Deparment deparment;
}
