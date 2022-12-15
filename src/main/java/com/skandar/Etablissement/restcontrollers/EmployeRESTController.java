package com.skandar.Etablissement.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skandar.Etablissement.entities.Employe;
import com.skandar.Etablissement.repos.EmployeRepository;

@RestController
@RequestMapping("/api/emp")
@CrossOrigin("*")
public class EmployeRESTController {

	@Autowired
	EmployeRepository employeRepository ;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Employe> getAllCategories()
	{
			return employeRepository.findAll();
	}
 
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Employe getEmployeById(@PathVariable("id") Long id) {
	return employeRepository.findById(id).get();
	}

	
}
