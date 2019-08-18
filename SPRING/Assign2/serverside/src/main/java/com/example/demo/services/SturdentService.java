package com.example.demo.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repos.StudentRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SturdentService {

	
	
	@Autowired
	private StudentRepo repositoryStudent;
	
	//FINDING STUDENT DETAILS BY STUDENTS ID AS PRIMARY KEY
	
	public Optional<Student> getDetails(long studentId){
		
		Optional<Student> returnedValue=null;
		
		try {
		
			  returnedValue = repositoryStudent.findById(studentId);
		}
		catch(Exception e){
			
			
			log.info(e.getMessage());
			
		}
		
		return returnedValue;
	}
	
	//ADDING STUDENT DETAILS
	public Boolean addStudent(Student entity) {
		
		//CHECKS IF THE VALUE IS ALREADY PRESENT IF PRESENT RETURN FALSE ELSE ADD
		
		Boolean status = true;
		
		
		if(!(repositoryStudent.findById(entity.getStudentId()).isPresent())) {
			
			repositoryStudent.save(entity);
			
		}
		else {
			
			
			status = false;
			
		}
		
	
		return status;
		
	}
	
	//DELETE STUDENT DETAILS
	public Boolean deleteStudent(long studentId) {
		
		Boolean status = true; //VARIABLE USED TO STORE THE STATUS OF THE QUERY
		
		try {
		repositoryStudent.deleteById(studentId);
		}
		catch (Exception exception){
			
			log.info(exception.getMessage()); //MESSAGE FOR CONSOLE FOR LOGGING
			status = false;
		}
		
		return status;
		
	}
	
	//UPDATING STUDENT DETAILS
	public Boolean updateStudent(Student entity) {
		
		//CHECKING IF STUDENT IS PRESENT OR NOT
		
		Boolean status = true;
		
		
		if(repositoryStudent.findById(entity.getStudentId()).isPresent()) {
			
			repositoryStudent.save(entity);
			
		}
		else {
			
			
			status = false;
			
		}
		
	
		return status;
		
		
	}
}
