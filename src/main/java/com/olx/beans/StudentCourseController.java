package com.olx.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.repository.StudentRepo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/students")
public class StudentCourseController {

	@Autowired
	StudentRepo studentRepo;

	@PostMapping
	public String addStudent(@RequestBody Student student) {
		studentRepo.save(student);
		return "Successfully Added";

	}

	@GetMapping
	public Iterable<Student> getStudent() {
		return studentRepo.findAll();

	}

}
