package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Student_Record")
public class Student {

	@Id
	private long studentId;
	private String studentName;
	private String section;
	private String fatherName;
	
	@Autowired
	private Address address;
}
