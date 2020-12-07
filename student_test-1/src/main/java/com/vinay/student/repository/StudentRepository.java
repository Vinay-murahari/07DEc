package com.vinay.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{



}
