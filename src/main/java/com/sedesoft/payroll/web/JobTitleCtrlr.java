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

import com.sedesoft.payroll.model.JobTitle;
import com.sedesoft.payroll.repository.JobTitleRepo;

@Controller
@RequestMapping("/employee/jobtitle")
public class JobTitleCtrlr {
	
	@Autowired
	JobTitleRepo jobTitleRepo;

	@ModelAttribute("jobtitle")
	public JobTitle jobtitle() {
		return new JobTitle();
	}
	
	@ModelAttribute("records")
	public List<JobTitle> records (){
		return jobTitleRepo.findAll();
	}
	
	/*
	 * Body
	 */
	
	@GetMapping
	public String init () {
		return "/employee/job-titles";
	}
	
	@GetMapping("/select/{id}")
	public String select(@PathVariable("id") Long id, Model model) {
		model.addAttribute("jobtitle", jobTitleRepo.findById(id));
		model.addAttribute("records", jobTitleRepo.findAll());
		model.addAttribute("selected", "true");
		return "/employee/job-titles";
	}

	@GetMapping("/insert")
	public String insert(@ModelAttribute("jobtitle") JobTitle jobTitle, BindingResult result, Model model) {
		if(result.hasErrors())
			return "/employee/job-titles";
		Optional<JobTitle> op = jobTitleRepo.findAll().stream().filter(x->x.getId().equals(jobTitle.getId())).findFirst();
		if(op.isPresent())
			return "redirect:/employee/jobtitle?fail";
		jobTitleRepo.save(turnToUpperCase(jobTitle));
		return "redirect:/employee/jobtitle";
	}
	
	@GetMapping("/update")
	public String update(@ModelAttribute("jobtitle") JobTitle JobTitle, BindingResult result, Model model) {
		if(result.hasErrors())
			return "/employee/job-titles";
		jobTitleRepo.save(turnToUpperCase(JobTitle));
		return "redirect:/employee/jobtitle";
		
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		jobTitleRepo.deleteById(id);
		return "redirect:/employee/jobtitle";
	}
	
	/*
	 * Service
	 * */
	private JobTitle turnToUpperCase(@Valid JobTitle JobTitle) {
		JobTitle delivery = new JobTitle();
		delivery.setId(JobTitle.getId());
		delivery.setName(JobTitle.getName().toUpperCase());
		delivery.setStatus(JobTitle.getStatus());
		return delivery;
	}
	
}
