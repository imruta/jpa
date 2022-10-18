package com.v.jpa.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AddressAOTOJPA_Q1 {
	@Id
	private int addressId;
	private int flatNo;
	private String road;
	private String state;
	
	@OneToOne(mappedBy = "a_address",orphanRemoval = true)
	private CustomerAOTOJPA_Q1 c_customer;
	
	public AddressAOTOJPA_Q1() {
		super();
	}
	public AddressAOTOJPA_Q1(int addressId, int flatNo, String road, String state) {
		super();
		this.addressId = addressId;
		this.flatNo = flatNo;
		this.road = road;
		this.state = state;
	}
	
	

	public CustomerAOTOJPA_Q1 getC_customer() {
		return c_customer;
	}
	public void setC_customer(CustomerAOTOJPA_Q1 c_customer) {
		this.c_customer = c_customer;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressAOTO_Q1 [addressId=" + addressId + ", flatNo=" + flatNo + ", road=" + road + ", state=" + state
				+ "]";
	}
	

}
