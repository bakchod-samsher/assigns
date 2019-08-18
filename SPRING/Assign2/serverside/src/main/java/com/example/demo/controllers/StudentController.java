package com.example.demo.controllers;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Student;
import com.example.demo.services.SturdentService;

@RestController
public class StudentController {

	@Autowired
	private SturdentService service;
	
	@PostMapping("/student")
	public Boolean getStudent(@RequestBody Student entity) {
		
		return service.addStudent(entity);
		
	}
	
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") long id) {
		
		return service.getDetails(id);
		
	}
	
	
	@DeleteMapping("/student/{id}")
	public Boolean deleteStudent(@PathVariable("id") long id) {
		
		return service.deleteStudent(id);
		
	}
	
	
	@PutMapping("/student")
	public Boolean updateStudentDetails(@RequestBody Student entity) {
		
		return service.updateStudent(entity);
		
	}
	
	
}
