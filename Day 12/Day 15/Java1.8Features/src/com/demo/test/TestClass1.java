package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestClass1 {

	public static void main(String[] args) {
		List<Integer> lst=List.of(25,5,2,32,12,15,5,10,7);
		List<Integer> lst1=lst.stream().filter(num->num%4==0).collect(Collectors.toList());
		Optional<Integer> op=lst.stream().filter(num->num%4==0).findAny();
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("not found");
		}
		//if all the numbers are matching the condition then it returns true,
		//otherwise it returns false
		System.out.println("allMatch: "+lst.stream().allMatch(num->num>10));
		//if any one of the numbers is matching the condition then it returns true,
		//otherwise it returns false
		System.out.println("anyMatch: "+lst.stream().anyMatch(num->num>10));
		//if any none of the numbers is matching the condition then it returns true,
		//otherwise it returns false
		System.out.println("noneMatch: "+lst.stream().noneMatch(num->num>10));
	}

}
