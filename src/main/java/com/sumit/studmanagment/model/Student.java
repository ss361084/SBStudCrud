package com.sumit.studmanagment.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentTable")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studId;
	@Column(name = "name")
	private String name;
	@OneToOne
	@JoinColumn(name = "myAddressId",referencedColumnName = "addressId")
	private Address address;
	@OneToMany(mappedBy = "student")
	private List<Mobile> mobiles;
	public long getStudId() {
		return studId;
	}
	public void setStudId(long studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", address=" + address + ", mobiles=" + mobiles + "]";
	}
	public Student(long studId, String name, Address address, List<Mobile> mobiles) {
		super();
		this.studId = studId;
		this.name = name;
		this.address = address;
		this.mobiles = mobiles;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
