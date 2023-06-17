package com.deparment.service.controller;

import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deparment.service.entity.Deparment;
import com.deparment.service.service.DeparmentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/deparments")
@RequiredArgsConstructor
@Slf4j
public class DeparmetsController {
    private final DeparmentService deparmentService;
    
    @PostMapping("/save")
    @Description("this method called saveDeparment method.")
    public Deparment saveDeparment(Deparment deparment_) {
       log.info("Inside saveDeparment method of DepamentController");
        return deparmentService.saveDeparment(deparment_);
    }

    @GetMapping("/findDeparmentById/id = {id}")
    public Deparment findDeparmentById(@PathVariable("id") Long deparmentId) {
        log.info("Inside findDeparmentById method of DepamentController");
        return deparmentService.findDeparmentById(deparmentId);
    }

}
