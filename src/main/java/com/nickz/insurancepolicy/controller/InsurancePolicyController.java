package com.nickz.insurancepolicy.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nickz.insurancepolicy.model.InsurancePolicy;
import com.nickz.insurancepolicy.service.InsurancePolicyService;

@RestController
@RequestMapping(path = "/api/v1")
public class InsurancePolicyController {
    
    private InsurancePolicyService policyService;
    
    public InsurancePolicyController(InsurancePolicyService policyService) {
	this.policyService = policyService;
    }
    
    @GetMapping(path = "/policies", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    List<InsurancePolicy> getAllPolicies() {
	return policyService.findAll();
    }
}
