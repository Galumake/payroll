package com.sedesoft.payroll.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sedesoft.payroll.model.Department;
import com.sedesoft.payroll.repository.DepartmentRepo;

@Controller
@RequestMapping("/employee/department")
public class DepartmentCtrlr {

	@Autowired
	DepartmentRepo departmentRepo;
	
	@ModelAttribute("department")
	public Department jobtitle() {
		return new Department();
	}
	
	@ModelAttribute("records")
	public List<Department> records (){
		return departmentRepo.findAll();
	}
	
	/*
	 * Body
	 */
	
	@GetMapping
	public String init () {
		return "/employee/departments";
	}
	
	@GetMapping("/select/{id}")
	public String select(@PathVariable("id") Long id, Model model) {
		model.addAttribute("department", departmentRepo.findById(id));
		model.addAttribute("records", departmentRepo.findAll());
		model.addAttribute("selected", "true");
		return "/employee/departments";
	}

	@GetMapping("/insert")
	public String insert(@ModelAttribute("department") Department jobTitle, BindingResult result, Model model) {
		if(result.hasErrors())
			return "/employee/departments";
		Optional<Department> op = departmentRepo.findAll().stream().filter(x->x.getId().equals(jobTitle.getId())).findFirst();
		if(op.isPresent())
			return "redirect:/employee/department?fail";
		departmentRepo.save(turnToUpperCase(jobTitle));
		return "redirect:/employee/department";
	}
	
	@GetMapping("/update")
	public String update(@ModelAttribute("department") Department Department, BindingResult result, Model model) {
		if(result.hasErrors())
			return "/employee/departments";
		departmentRepo.save(turnToUpperCase(Department));
		return "redirect:/employee/department";
		
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		departmentRepo.deleteById(id);
		return "redirect:/employee/department";
	}
	
	/*
	 * Service
	 * */
	private Department turnToUpperCase(@Valid Department Department) {
		Department delivery = new Department();
		delivery.setId(Department.getId());
		delivery.setName(Department.getName().toUpperCase());
		delivery.setStatus(Department.getStatus());
		return delivery;
	}
}
