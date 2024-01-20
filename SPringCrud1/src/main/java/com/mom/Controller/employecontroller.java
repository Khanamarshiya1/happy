package com.mom.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mom.Entity.student;
import com.mom.Service.employeservice;
@RestController
@RequestMapping("/api")
public class employecontroller {
@Autowired

private employeservice empservice;
@PostMapping("/create")
public student create(student emp)
{
	return empservice.create(emp);
}

}

