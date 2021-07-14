package com.olx.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int id;
	String name;
	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "profile_id")
	Account account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
