package come.clientside.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import come.clientside.models.Student;

@Controller
public class StudentController {
	
	private String URL = "http://localhost:9000/student";
	
	@Autowired
	private RestTemplate rest;
	

	
	
	@PostMapping("/addStudent")
	public String onSubmit(@Valid @ModelAttribute("command") Student student,BindingResult result) {
		
		String nextPage = "failure";
		
	
		if(!result.hasErrors() && student.getStudentName()!="") {
			
			nextPage = "success"; 
			
			try {
				
			this.rest.postForObject(this.URL, student,Boolean.class);
			}
			catch(Exception e)
			{
				nextPage="failure";
			}
			 
		}
			
			return nextPage;		
		
	}
	
	@PostMapping("/updateStudentData")
	public String onUpdate(@Valid @ModelAttribute("command") Student student , BindingResult result) {
		
		
		//System.out.println(student);
		
		String nextPage="success";
		try{this.rest.put(this.URL, student);}
		catch(Exception e) {
			nextPage = "failure";
		}
		
		
		return nextPage;
	}
	


}
