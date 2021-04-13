package com.kokul.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kokul.entities.Benefits;

public interface BenefitRepo extends JpaRepository<Benefits, Integer> {

	Benefits findByBenefitId(int benefitId);

}
