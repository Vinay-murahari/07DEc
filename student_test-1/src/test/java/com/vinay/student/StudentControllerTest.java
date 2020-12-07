package com.vinay.student;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.vinay.student.entity.Student;
import com.vinay.student.repository.StudentRepository;

@RunWith(SpringRunner.class)

public class StudentControllerTest {
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@Autowired
//	private StudentController studentController;
	
//	@Test
//	public void allStudents() {
//		Iterable<Student> student = studentRepository.findAll();
//		assertThat(student).isEmpty();
//	}

	@Test
	public void addStudent() {
		Student student = studentRepository.save(new Student(101,"vinay","murahari","boxhill"));

		assertThat(student).hasFieldOrPropertyWithValue("student_id", 101);
		assertThat(student).hasFieldOrPropertyWithValue("student_fname", "vinay");
		assertThat(student).hasFieldOrPropertyWithValue("student_lname", "murahari");
		assertThat(student).hasFieldOrPropertyWithValue("student_adress", "boxhill");
		
	  }
	@Test
	public void allStudents() {
		
		Student stu1 = new Student(101,"test1","test","test");
		entityManager.persist(stu1);
		Student stu2 = new Student(102,"test2","test","test");
		entityManager.persist(stu2);
		Student stu3 = new Student(103,"test3","test","test");
		entityManager.persist(stu3);
		
		Iterable<Student> students = studentRepository.findAll();

	    assertThat(students).hasSize(3).contains(stu1, stu2, stu3);
		
	}
	
	
}