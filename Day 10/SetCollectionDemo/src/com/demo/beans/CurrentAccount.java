package com.demo.beans;

public class CurrentAccount extends Account{
	private int min_transaction;
	private static float int_rate;
	private static float min_balance;
	static {
		int_rate=0.02f;
		min_balance=0f;
	}
	public CurrentAccount() {
		super("c");
	}
	public CurrentAccount( String aname, int pin, String question, String ans, double balance,int min_transaction) {
		super("c", aname,pin,question,  ans,balance);
		this.min_transaction = min_transaction;
	}
	public int getMin_transaction() {
		return min_transaction;
	}
	public void setMin_transaction(int min_transaction) {
		this.min_transaction = min_transaction;
	}
	public static float getInt_rate() {
		return int_rate;
	}
	public static void setInt_rate(float int_rate) {
		CurrentAccount.int_rate = int_rate;
	}
	public static float getMin_balnce() {
		return min_balance;
	}
	public static void setMin_balnce(float min_balance) {
		CurrentAccount.min_balance = min_balance;
	}
	@Override
	public String toString() {
		return super.toString()+"CurrentAccount [min_transaction=" + min_transaction + "]";
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
