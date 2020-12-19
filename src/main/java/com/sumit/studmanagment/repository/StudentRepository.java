package com.sumit.studmanagment.repository;

import org.springframework.data.repository.CrudRepository;

import com.sumit.studmanagment.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
