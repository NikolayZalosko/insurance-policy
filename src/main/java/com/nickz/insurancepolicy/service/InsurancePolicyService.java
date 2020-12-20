package com.nickz.insurancepolicy.service;

import java.util.List;

import com.nickz.insurancepolicy.model.InsurancePolicy;

public interface InsurancePolicyService {
    List<InsurancePolicy> findAll();
}
