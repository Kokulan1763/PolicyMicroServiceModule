package com.kokul.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kokul.entities.ProviderPolicy;

public interface ProviderPolicyRepo extends JpaRepository<ProviderPolicy, Integer>{


	ProviderPolicy save(ProviderPolicy providers);

	
	List<ProviderPolicy> findAllByPolicyIdOrderByLocation(int PolicyId);

	
	

}
