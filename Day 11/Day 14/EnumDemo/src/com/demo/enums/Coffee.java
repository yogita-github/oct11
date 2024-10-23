package com.demo.enums;

public enum Coffee {
	small(150,150),medium(200,250),big(300,350);  //all objects are static type
	
	private int size;
	private float price;
	private Coffee(int size, float price) {
		System.out.println("in parametrized constructor "+size+"----"+price);
		this.size = size;
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
