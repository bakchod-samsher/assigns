package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Student;

public interface StudentRepo extends CrudRepository<Student, Long> {

	
}
