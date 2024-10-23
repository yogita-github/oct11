package com.demo.beans;

public class Storage {
	private int n;
	private boolean valueset;//,stopflag;
	public Storage() {
		super();
		valueset=false;
		//stopflag=false;
	}
	
	synchronized public void put(int x) {
		if(valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("in put : "+x);
		n=x;
		valueset=true;
		notify();
		
		
	}
	
	synchronized public void get() {
		if(!valueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("in get "+n); //consumer functionality
		valueset=false;
		notify();
	}
	

}
