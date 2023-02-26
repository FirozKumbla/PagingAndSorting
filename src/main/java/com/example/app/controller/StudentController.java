package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.Student;
import com.example.app.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student saveStd(@RequestBody Student std) {
		return studentService.saveStudent(std);
	}
	
	@GetMapping("/get/{id}")
	public Student getStdById(@PathVariable Integer id) {
		return studentService.getStdById(id);
	}
	
	@GetMapping("/getAll/{pageno}/{count}")
	public List<Student> getAllStudents(@PathVariable int pageno, @PathVariable int count){
		return studentService.getAllStudents(pageno, count);
	}
	
	@GetMapping("/getByName/{stdname}/{pageno}/{count}")
	public List<Student> getStdByName(@PathVariable String stdname, @PathVariable int pageno, 
			@PathVariable int count){
		return studentService.getStdByName(stdname,pageno, count );
	}

}
