package com.example.app.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	public List<Student> getStdByName(String name, Pageable pageable);

}
