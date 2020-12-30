package com.sumit.studmanagment.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sumit.studmanagment.listenum.Gender;

@Entity
@Table(name = "StudentTable")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studId;
	@NotBlank(message = "Enter First Name")
	@Size(min = 3,message = "Minimum 3 characters are required")
	@Column(name = "fName")
	private String fName;
	@NotBlank(message = "Enter Middle Name")
	@Size(min = 1,message = "Minimum 3 characters are required")
	@Column(name = "mName")
	private String mName;
	@NotBlank(message = "Enter Last Name")
	@Size(min = 3,message = "Minimum 3 characters are required")
	@Column(name = "lName")
	private String lName;
	@Column(name = "email")
	@Email(message = "Enter Correct Email")
	@NotBlank(message = "Enter Email")
	private String email;
	@Column(name = "bDate")
	@NotNull(message = "Enter Birth Date")
	private Date bDate;
	@NotNull(message = "Select Gender")
	@Column(name = "gender")
	private Gender gender;
	@OneToOne
	@Valid
	private Address address;
	
	public Student(long studId,
			@NotBlank(message = "Enter First Name") @Size(min = 3, message = "Minimum 3 characters are required") String fName,
			@NotBlank(message = "Enter Middle Name") @Size(min = 1, message = "Minimum 3 characters are required") String mName,
			@NotBlank(message = "Enter Last Name") @Size(min = 3, message = "Minimum 3 characters are required") String lName,
			@Email(message = "Enter Correct Email") @NotBlank(message = "Enter Email") String email,
			@NotNull(message = "Enter Birth Date") Date bDate, @NotNull(message = "Select Gender") Gender gender,
			@Valid Address address) {
		super();
		this.studId = studId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.email = email;
		this.bDate = bDate;
		this.gender = gender;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getStudId() {
		return studId;
	}
	public void setStudId(long studId) {
		this.studId = studId;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", email="
				+ email + ", bDate=" + bDate + ", gender=" + gender + ", address=" + address + "]";
	}
}
