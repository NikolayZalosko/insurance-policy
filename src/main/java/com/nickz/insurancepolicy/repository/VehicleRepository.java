package com.nickz.insurancepolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nickz.insurancepolicy.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
