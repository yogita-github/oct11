package com.demo.test;

import java.util.List;

import com.demo.beans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> lst=List.of(new Employee(10,"xxx",3456,345),new Employee(11,"yyy",4444,445),new Employee(12,"zzzz",5555,555));
        lst.stream().filter(emp->emp.getSal()>4000).forEach(syste.out::println);
	}

}
