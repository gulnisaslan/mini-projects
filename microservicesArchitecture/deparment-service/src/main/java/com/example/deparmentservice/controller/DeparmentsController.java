package com.example.deparmentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deparmentservice.entity.Deparment;
import com.example.deparmentservice.service.DeparmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/deparment/")
@Slf4j
public class DeparmentsController {
    private final DeparmentService deparmentService;

    public DeparmentsController(DeparmentService deparmentService) {
        this.deparmentService = deparmentService;
    }

    @PostMapping(value = "add")
    public Deparment saveDeparment(@RequestBody Deparment deparment) {
       log.info("Inside saveDeparment method of DeparmentController");
        return this.deparmentService.saveDeparment(deparment);
    }

    @GetMapping(value="{id}")
    public Deparment getByDeparmentId(@PathVariable("id") Long deparmentId){
        log.info("Inside getByDeparmentId method of DeparmentController");
        return this.deparmentService.getByDeparmentId(deparmentId);
    }
}
