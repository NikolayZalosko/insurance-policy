package com.nickz.insurancepolicy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    @Column(name = "model")
    String model;
    
    @Column(name = "production_year")
    Integer address;
    
    @Column(name = "VIN")
    String VIN;
    
    @Column(name = "register_sign")
    String registerSign;
    
    @Column(name = "category")
    String category;
}
