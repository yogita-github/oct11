package com.demo.test;

import com.demo.enums.Coffee;

public class TestCoffeeEnum {

	public static void main(String[] args) {
		Coffee c=Coffee.small;
		System.out.println("Display menu");
		switch(c) {
		case small:
			System.out.println("small selected");
			break;
		case medium:
			System.out.println("medium selected");
			break;
		case big:
			System.out.println("big selected");
			break;
		}

	}

}
