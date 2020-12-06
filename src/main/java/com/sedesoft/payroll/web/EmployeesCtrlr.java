package com.sedesoft.payroll.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeesCtrlr {

	@GetMapping
	public String show (HttpServletRequest request) {
	
		return "/employee/employees";
	}
}
