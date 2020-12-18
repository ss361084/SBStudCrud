package com.sumit.studmanagment.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

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
	@Size(min = 3,message = "Minimum 3 characters are required")
	@Column(name = "mName")
	private String mName;
	@NotBlank(message = "Enter Last Name")
	@Size(min = 3,message = "Minimum 3 characters are required")
	@Column(name = "lName")
	private String lName;
	@Column(name = "email")
	@Email(message = "Enter Correct Email",regexp = "")
	@NotBlank(message = "Enter Email")
	private String email;
	@Column(name = "bDate")
	@NotNull(message = "Enter Birth Date")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date bDate;
	@NotNull(message = "Select Gender")
	@Column(name = "gender")
	private Gender gender;
	
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
	public Student(long studId, @NotBlank(message = "Enter Student Name") String fName, String mName, String lName,
			@Email String email, Address address) {
		super();
		this.studId = studId;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.email = email;
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Valid
	@OneToOne
	@JoinColumn(name = "myAddressId",referencedColumnName = "addressId")
	private Address address;
	
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
	//	@OneToMany(mappedBy = "student")
//	private List<Mobile> mobiles;
	public long getStudId() {
		return studId;
	}
	public void setStudId(long studId) {
		this.studId = studId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
//	public List<Mobile> getMobiles() {
//		return mobiles;
//	}
//	public void setMobiles(List<Mobile> mobiles) {
//		this.mobiles = mobiles;
//	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", email="
				+ email + ", address=" + address + "]";
	}
}
