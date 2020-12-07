package com.vinay.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.student.entity.Student;
import com.vinay.student.repository.StudentRepository;

@RestController
@RequestMapping("/student1")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/student")
	public List<Student> allStudents(){
		return studentRepository.findAll();	
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return studentRepository.save(student);	
	}
	
	@GetMapping("/student/{student_id}")
	public Student findStudent(@PathVariable int student_id) {
		Optional<Student> student = studentRepository.findById(student_id);
		if(student.isPresent()) {
			return student.get();
		}
		else {
			throw new RuntimeException("Student not found for the given id " + student_id);
		}
	}
	
	@DeleteMapping("/student/{student_id}")
	public String deleteStudent(@PathVariable int student_id) {
		Optional<Student> student = studentRepository.findById(student_id);
		if(student.isPresent()) {
			studentRepository.delete(student.get());
			return " student record is deleted for the given id" + student_id; 
		}else {
			throw new RuntimeException("Student not found for the given id " + student_id);
		}
		
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}

}