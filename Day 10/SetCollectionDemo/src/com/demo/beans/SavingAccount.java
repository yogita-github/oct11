package com.demo.beans;

public class SavingAccount extends Account {
	private int chequebknum;
	static float int_rate;
	static float min_balance;
	static {
		int_rate=0.04f;
		min_balance=5000f;
	}
	public SavingAccount() {
		super("s");
	}
	public SavingAccount( String aname, int pin, String question, String ans, double balance,int chequebknum) {
		super("s", aname, pin,question,  ans, balance);
		this.chequebknum = chequebknum;
	}
	public int getChequebknum() {
		return chequebknum;
	}
	public void setChequebknum(int chequebknum) {
		this.chequebknum = chequebknum;
	}
	public static float getInt_rate() {
		return int_rate;
	}
	public static void setInt_rate(float int_rate) {
		SavingAccount.int_rate = int_rate;
	}
	public static float getMin_balance() {
		return min_balance;
	}
	public static void setMin_balance(float min_balance) {
		SavingAccount.min_balance = min_balance;
	}
	@Override
	public String toString() {
		return super.toString()+"SavingAccount [chequebknum=" + chequebknum + "]";
	}
	@Override
	public int withdraw(double amt) {
		if(balance-amt>=min_balance) {
			balance=balance-amt;
			return 1;
		}
		return 2;
	}
	

}
