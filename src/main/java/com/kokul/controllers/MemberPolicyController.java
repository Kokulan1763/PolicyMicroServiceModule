package com.kokul.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kokul.entities.Benefits;
import com.kokul.entities.MemberPolicy;
import com.kokul.repos.BenefitRepo;
import com.kokul.repos.MemberPolicyRepo;
@RestController
@RequestMapping("/benefits")
public class MemberPolicyController {

	@Autowired
	MemberPolicyRepo repo;
	
	@Autowired
	BenefitRepo brepo;
	
	@RequestMapping(value = "getBenefits/{policyId}/{memberId}", method = RequestMethod.GET)
	public List<Benefits> getElegibleBenefits(@PathVariable("policyId") int policyId,
			@PathVariable("memberId") int memberId) {
		
		List<MemberPolicy> providers = repo.findAllByPolicyIdAndMemberId(policyId,memberId);
		List<Benefits> benefitDetails = new ArrayList<Benefits>();
		for(MemberPolicy memberPolicy : providers) {
			int benefitId = memberPolicy.getBenefitId();
			benefitDetails.add(getBenefitId(benefitId));
			
		}
		return benefitDetails;

	}
	
	
	public Benefits getBenefitId(int benefitId) {
		return brepo.findByBenefitId(benefitId);
	}
}
