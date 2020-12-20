package com.nickz.insurancepolicy.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "insurance_policy")
@Getter
@Setter
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    @Column(name = "type")
    String type;
    
    @ManyToOne
    @JoinColumn(name = "insurant_id")
    Person insurant;
    
    @Column(name = "start_date")
    LocalDateTime startDate;
    
    @Column(name = "end_date")
    LocalDateTime endDate;
    
    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    Vehicle vehicle;
    
    @Column(name = "sign_date")
    LocalDate signDate;
}
