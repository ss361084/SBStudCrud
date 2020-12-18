package com.sumit.studmanagment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "AddressTable")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	@Positive(message = "Enter House No")
	@Column(name = "houseNo", nullable = true)
	private int houseNo;
	@NotBlank(message = "Enter Address")
	@Column(name = "address")
	private String address;
	@NotBlank(message = "Enter City")
	@Column(name = "city")
	private String city;
	@NotBlank(message = "Enter State")
	@Column(name = "state")
	private String state;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNo=" + houseNo + ", address=" + address + ", city=" + city
				+ ", state=" + state + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Long addressId, int houseNo, String address, String city, String state) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.address = address;
		this.city = city;
		this.state = state;
	}
}
