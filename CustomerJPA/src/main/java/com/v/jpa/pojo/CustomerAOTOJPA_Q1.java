package com.v.jpa.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CustomerAOTOJPA_Q1 {
	
	@Id
	private int custId;
	private String custName;
	
	//orphanRemoval = true
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(orphanRemoval = true)

	private AddressAOTOJPA_Q1 a_address;
	
	
	public CustomerAOTOJPA_Q1() {
		super();
	}
	public CustomerAOTOJPA_Q1(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	
	

	public AddressAOTOJPA_Q1 getA_address() {
		return a_address;
	}
	public void setA_address(AddressAOTOJPA_Q1 a_address) {
		this.a_address = a_address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "CustomerAOTO_Q1 [custId=" + custId + ", custName=" + custName + "]";
	}
	
	
	
	

}
