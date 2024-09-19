package com.crudAPI.example.CRUD_Operations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAPI.example.CRUD_Operations.entity.Students;
import com.crudAPI.example.CRUD_Operations.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	public Students addStudent(Students student) {
		return studentRepo.save(student);
	}
	public List<Students> getAllStudents(){
		return studentRepo.findAll();
	}

}
