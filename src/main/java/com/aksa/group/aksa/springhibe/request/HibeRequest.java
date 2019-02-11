package com.aksa.group.aksa.springhibe.request;

import java.util.List;

import com.aksa.group.aksa.springhibe.entity.Customer;

public class HibeRequest {

	List<Customer> custoemrList;

	public List<Customer> getCustoemrList() {
		return custoemrList;
	}

	public void setCustoemrList(List<Customer> custoemrList) {
		this.custoemrList = custoemrList;
	}

}
