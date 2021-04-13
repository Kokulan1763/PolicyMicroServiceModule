package com.kokul.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kokul.entities.Benefits;
import com.kokul.entities.MemberPolicy;

public interface MemberPolicyRepo extends JpaRepository<MemberPolicy , Integer>{

	List<MemberPolicy> findAllByPolicyIdAndMemberId(int policyId, int memberId);
	
}
