package com.olx.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int acc_id;
	public int getAcc_id() {
		return acc_id;
	}


	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	String name;
	int account_no;

}
