package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {

	public static void main(String[] args) {
		List<Integer> lst=List.of(25,5,2,34,12,15,5,10,7);
		Predicate<Integer> p=(num)->{System.out.print("in filter :"+num);
		return num%5==0;};
		Stream s=lst.stream().filter((num)->{System.out.print("in filter :"+num);
		return num%5==0;});
		System.out.println("after defining stream");
		s.forEach(System.out::println);
		//List<Integer> lst1=(List<Integer>) s.collect(Collectors.toList());
        List<Integer> lst1=lst.stream().map(num->num*num).collect(Collectors.toList());
        System.out.println(lst1);
        Optional<Integer> sum=lst.stream().reduce((acc,num)->acc+num);
        if(sum.isPresent())
           System.out.println(sum.get());
        else {
        	System.out.println("not found");
        }
        Optional<Integer> max=lst.stream().reduce((acc,num)->acc>num?acc:num);
        if(sum.isPresent())
           System.out.println(max.get());
        else {
        	System.out.println("not found");
        }
	}

}
