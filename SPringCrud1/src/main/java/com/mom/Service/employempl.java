package com.mom.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mom.Entity.student;
import com.mom.Repositary.employerepositary;

@Service
public class employempl implements  employeservice
{
	@Autowired
	private employerepositary empRepo;
	public student create(student emp)
	{
		return empRepo.save(emp);
	}
	
	
}
