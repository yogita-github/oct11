package com.demo.test;

import com.demo.beans.Customer;
import com.demo.enums.Gender;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c=new Customer(12,"Revati",Gender.male);
		Gender g=Gender.female;
		System.out.println("ordinal: "+g.ordinal());
		System.out.println(g.valueOf("male"));

	}

}
