package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.app.entity.Student;
import com.example.app.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> getAllStudents(int pageno, int count){
		Pageable pageable = PageRequest.of(pageno, count, Sort.by("name"));
		return studentRepo.findAll(pageable).get().toList();
	}
	
	public Student getStdById(Integer id) {
		return studentRepo.findById(id).get();
	}
	
	public List<Student> getStdByName(String name, int pageno, int count){
		Pageable pageable = PageRequest.of(pageno, count, Sort.by("city"));
		return studentRepo.getStdByName(name, pageable);
	}

}
