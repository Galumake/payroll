package com.sedesoft.payroll.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sedesoft.payroll.model.Department;
import com.sedesoft.payroll.model.Headquarter;
import com.sedesoft.payroll.model.JobTitle;
import com.sedesoft.payroll.repository.DepartmentRepo;
import com.sedesoft.payroll.repository.HeadquarterRepo;
import com.sedesoft.payroll.repository.JobTitleRepo;

@Controller
@RequestMapping("/employees")
public class EmployeesCtrlr {
	
	@Autowired
	HeadquarterRepo headquarterRepo;

	@Autowired
	JobTitleRepo jobTitleRepo;

	@Autowired
	DepartmentRepo departmentRepo;
	
	@ModelAttribute("headquarters")
	public List<Headquarter>  headquarter() {
		return headquarterRepo.findAll();
	}
	
	@ModelAttribute("jobtitles")
	public List<JobTitle>  jobtitle() {
		return jobTitleRepo.findAll();
	}
	
	@ModelAttribute("departments")
	public List<Department>  department() {
		return departmentRepo.findAll();
	}
	
	/*
	 * body
	 * */
	@GetMapping
	public String show (HttpServletRequest request) {
		return "/employee/employees";
	}
	
	
	
}
