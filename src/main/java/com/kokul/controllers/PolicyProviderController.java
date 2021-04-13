package com.kokul.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kokul.entities.ProviderPolicy;
import com.kokul.repos.ProviderPolicyRepo;

@RestController
@RequestMapping("/providers")
public class PolicyProviderController {

	@Autowired
	ProviderPolicyRepo repo;

	@RequestMapping(value = "/saveProviders", method = RequestMethod.POST)
	public ProviderPolicy setProviderPolicy(@RequestBody ProviderPolicy providers) {
		return repo.save(providers);
	}

	@RequestMapping(value = "getProviders/{policyId}", method = RequestMethod.GET)
	public List<String> getChainOfProviders(@PathVariable("policyId") int policyId) {
		List<ProviderPolicy> providers = repo.findAllByPolicyIdOrderByLocation(policyId);
		List<String> providerDetails = new ArrayList<String>();
		String details = null;
		for (ProviderPolicy provider : providers) {
			details = provider.getHospitalId() + "   " + provider.getHospitalName() + "   "
					+ provider.getHospitalAddress() + "   " + provider.getLocation();
			providerDetails.add(details);
		}
		return providerDetails;
	}


}
