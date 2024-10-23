package com.demo.beans;

import com.demo.enums.Gender;

public class Customer {
	private int cid;
	private String cname;
	private Gender gender;
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, Gender gender) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.gender = gender;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", gender=" + gender + "]";
	}
	

}
