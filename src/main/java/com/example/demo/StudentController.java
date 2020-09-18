package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/students")
	public String students() {
		return "Student1, Student2, Student3, Student4, Student5, Student6, Student7, Student8, Student9, Student10, Student11";
	}
}
