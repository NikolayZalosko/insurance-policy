package com.nickz.insurancepolicy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nickz.insurancepolicy.model.InsurancePolicy;
import com.nickz.insurancepolicy.repository.InsurancePolicyRepository;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

    private InsurancePolicyRepository policyRepository;
    
    public InsurancePolicyServiceImpl(InsurancePolicyRepository policyRepository) {
	this.policyRepository = policyRepository;
    }
    
    @Override
    public List<InsurancePolicy> findAll() {
	return policyRepository.findAll();
    }

}
