package com.sumit.studmanagment.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
	
	public List<Student> getAllStudent(){
		List<Student> listStudent = new ArrayList<>(); 
		Iterator<Student> list = studentRepository.findAll().iterator();
		while(list.hasNext()) {
			listStudent.add(list.next());
		}
		return listStudent;
	}
}
