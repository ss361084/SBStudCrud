package com.sumit.studmanagment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.studmanagment.model.Student;
import com.sumit.studmanagment.repository.AddressReposioty;
import com.sumit.studmanagment.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private AddressReposioty addressReposioty;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveStudent(Student student) {
		addressReposioty.save(student.getAddress());
		studentRepository.save(student);
	}
}
