package come.clientside.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import come.clientside.models.Student;


@Controller
public class StudentUpdateController {
	
	private String URL = "http://localhost:9000/student/";
	
	@Autowired
	private RestTemplate rest;
	
	@Autowired
	private Student student;
	
	@Autowired
	private ModelAndView mdlView;
	
	
	
	@ModelAttribute("sectionList")
	public String[] sections() {
		
		return new String[] {"A","B","C","D"};
	}
	
	
	@GetMapping("/addStudent")
	public ModelAndView initForm() {
		
		mdlView.setViewName("addStudent");
		mdlView.addObject("command",student);
		return mdlView;
		
	}
	
	@RequestMapping("/searchStudent")
	public ModelAndView formConstructor(@RequestParam(value= "id" , defaultValue = "-1") long studentId) {
		
		Student student = null;
		
		if(studentId!=-1) {
		student = rest.getForObject(URL+studentId, Student.class);}
		else {
			mdlView.setViewName("failure");
		}
		
		if(student!=null) {
		mdlView.setViewName("updateStudent");
		mdlView.addObject("command",student);
		}
		else {
		 mdlView.setViewName("failure");
		}
		
		return mdlView;
	}
	
	
	@GetMapping("/deleteStudent")
	public String onDelete(@RequestParam(value = "id", defaultValue = "-1") long studentId)
	{
		String page="success";
		
		System.out.println(studentId);
		
		if(studentId!=-1){
		rest.delete(URL+studentId);
		}
		else {
		page="failure";	
		}
		return page;
	}
	

	@GetMapping("/showStudentInfo")
	public ModelAndView onShow(@RequestParam(value = "id", defaultValue = "-1") long studentId) {
		
		Student student=null;
		
		if(studentId!=-1) {
		student = rest.getForObject(URL+studentId, Student.class);
		}else {
			mdlView.setViewName("failure");
		}
		
		if(student!=null) {
		mdlView.setViewName("showStudent");
		mdlView.addObject("command",student);
		 }
		else {
		
			mdlView.setViewName("failure");
			
		}
		
		return mdlView;
	}


}
