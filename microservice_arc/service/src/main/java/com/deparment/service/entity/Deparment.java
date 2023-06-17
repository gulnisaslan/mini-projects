package com.deparment.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Deparment {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long deparmentId;
   private String deparmentName;
   private String deparmentAddress;
   private String depamentCode;
}
