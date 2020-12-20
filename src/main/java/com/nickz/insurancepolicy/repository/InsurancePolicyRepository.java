package com.nickz.insurancepolicy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nickz.insurancepolicy.model.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {

}
