package com.nickz.insurancepolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nickz.insurancepolicy.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
