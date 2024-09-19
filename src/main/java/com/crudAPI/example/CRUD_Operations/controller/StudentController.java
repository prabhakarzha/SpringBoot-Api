package com.crudAPI.example.CRUD_Operations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudAPI.example.CRUD_Operations.entity.Students;
import com.crudAPI.example.CRUD_Operations.service.StudentService;

@RestController

public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/addStudent")
	public Students addStudent(@RequestBody Students students) {
		// process POST request
		return studentService.addStudent(students);
	}
	@GetMapping("/getStudents")
	public List<Students> getAllStudents(){
		return studentService.getAllStudents();
	}
			
	
	

}
