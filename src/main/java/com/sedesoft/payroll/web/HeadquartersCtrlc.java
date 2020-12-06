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
import com.sedesoft.payroll.model.Headquarter;
import com.sedesoft.payroll.repository.HeadquarterRepo;

@Controller
@RequestMapping("/employee/headquarters")
public class HeadquartersCtrlc {

	@Autowired
	HeadquarterRepo headquarterRepo;

	@ModelAttribute("headquarter")
	public Headquarter headquarter() {
		return new Headquarter();
	}

	@ModelAttribute("records")
	public List<Headquarter> records() {
		return headquarterRepo.findAll();
	}

	/*
	 * Body
	 */
	@GetMapping
	public String show() {
		return "/employee/headquarters";
	}

	@GetMapping("/select/{id}")
	public String select(@PathVariable("id") Long id, Model model) {
		model.addAttribute("headquarter", headquarterRepo.findById(id));
		model.addAttribute("records", headquarterRepo.findAll());
		model.addAttribute("selected", "true");
		return "/employee/headquarters";
	}

	@GetMapping("/insert")
	public String insert(@ModelAttribute("headquarter") Headquarter headquarter, BindingResult result, Model model) {
		if(result.hasErrors())
			return "/employee/headquarters";
		Optional<Headquarter> op = headquarterRepo.findAll().stream().filter(x->x.getId().equals(headquarter.getId())).findFirst();
		if(op.isPresent())
			return "redirect:/employee/headquarters?fail";
		headquarterRepo.save(turnToUpperCase(headquarter));
		return "redirect:/employee/headquarters";
	}
	
	@GetMapping("/update")
	public String update(@ModelAttribute("headquarter") Headquarter headquarter, BindingResult result, Model model) {
		if(result.hasErrors())
			return "/employee/headquarters";
		headquarterRepo.save(turnToUpperCase(headquarter));
		return "redirect:/employee/headquarters";
		
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		headquarterRepo.deleteById(id);
		return "redirect:/employee/headquarters";
	}
	
	/*
	 * Service
	 * */
	private Headquarter turnToUpperCase(@Valid Headquarter headquarter) {
		Headquarter delivery = new Headquarter();
		delivery.setId(headquarter.getId());
		delivery.setName(headquarter.getName().toUpperCase());
		delivery.setStatus(headquarter.getStatus());
		return delivery;
	}
	

}
