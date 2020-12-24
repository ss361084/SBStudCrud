package com.sumit.studmanagment.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.studmanagment.model.Student;
import com.sumit.studmanagment.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
//	@Autowired
//	private AddressReposioty addressReposioty;
	@Autowired
	private EntityManager entityManager;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveStudent(Student student) {
//		addressReposioty.save(student.getAddress());
		studentRepository.save(student);
	}
	
	public List<Student> getAllStudent(){
//		List<Student> listStudent = new ArrayList<>(); 
//		Iterator<Student> list = studentRepository.findAll().iterator();
//		while(list.hasNext()) {
//			listStudent.add(list.next());
//		}
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
		Root<Student> root = criteriaQuery.from(Student.class);
		criteriaQuery.orderBy(criteriaBuilder.desc(root.get("studId")));
		criteriaQuery.select(root);
		
		Query<Student> query = session.createQuery(criteriaQuery);
		
		List<Student> listStudent = query.getResultList();
		return listStudent;
	}
	
	public int getStudentByEmail(String email) {
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Student> criteriaQuery = builder.createQuery(Student.class);
		Root<Student> root = criteriaQuery.from(Student.class);
		
		criteriaQuery.select(root).where(builder.equal(root.get("email"), email));
		
		Query<Student> query = session.createQuery(criteriaQuery);
		List<Student>list = query.getResultList();
		return list.size();
	}
	
	public void deleteStudentById(long studentId) {
		studentRepository.deleteById(studentId);
	}
	
	public Student getStudentById(long studentId) {
		return Optional.ofNullable(studentRepository.findById(studentId)).get().orElse(null);
	}
}
