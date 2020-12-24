package com.sumit.studmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.studmanagment.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
