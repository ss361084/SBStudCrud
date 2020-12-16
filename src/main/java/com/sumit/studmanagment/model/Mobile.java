package com.sumit.studmanagment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MobileTable")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long mobileId;
	@Column(unique = true, name = "mobile")
	private long mobile;
	@ManyToOne
	@JoinColumn(name = "myStudId", referencedColumnName = "studId")
	private Student student;
	public long getMobileId() {
		return mobileId;
	}
	public void setMobileId(long mobileId) {
		this.mobileId = mobileId;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobile=" + mobile + ", student=" + student + "]";
	}
	public Mobile(long mobileId, long mobile, Student student) {
		super();
		this.mobileId = mobileId;
		this.mobile = mobile;
		this.student = student;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
}
