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
@Table(name = "person")
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    @Column(name = "full_name")
    String fullName;
    
    @Column(name = "address")
    String address;
    
    @Column(name = "passport_info")
    String passportInfo;
    
    @Column(name = "phone_number")
    String phoneNumber;
    
    @Column(name = "email")
    String email;
}
