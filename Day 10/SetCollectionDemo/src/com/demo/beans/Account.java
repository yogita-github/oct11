package com.demo.beans;

abstract public class Account implements Comparable<Account>{
	static int cnt;
	static {cnt=1;}
	private String acid;
	private String aname;
	private int pin;
	private String question;
	private String ans;
	protected double balance;
	@Override
	public int hashCode() {
		System.out.println("In account hashCode : "+aname+"---"+pin);
		return aname.hashCode()+pin;
	}
	@Override
	public boolean equals(Object obj) {
		Account ac=(Account)obj;
		System.out.println("In account equals : "+aname+"---"+pin+"--->"+ac.aname+"---"+ac.pin);
		return this.aname.equals(ac.aname) && this.pin==ac.pin;
	}

	
	
	public Account(String type) {
		super();
		this.acid = generateId(type,null);
	}
	private String generateId(String type,String aname) {
		String id=null;
		if(aname!=null) {
			id=type+aname.substring(0,2)+cnt;
		}else {
			id=type+"xx"+cnt;
		}
		cnt++;
		return id;
	}

	public Account(String type, String aname, int pin, String question, String ans, double balance) {
		super();
		this.acid = generateId(type,aname);
		this.aname = aname;
		this.pin = pin;
		this.question = question;
		this.ans = ans;
		this.balance = balance;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Account.cnt = cnt;
	}

	public String getAcid() {
		return acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", aname=" + aname + ", pin=" + pin + ", question=" + question + ", ans=" + ans
				+ ", balance=" + balance + "]";
	}
	abstract public int withdraw(double amt);
	public void deposit(double amt) {
		balance=balance+amt;
	}
	public int compareTo(Account ob) {
		System.out.println("in compareTo account : "+this.acid+"----"+ob.acid);
		return this.acid.compareTo(ob.acid);
	}
	

}
