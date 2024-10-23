package com.demo.beans;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer>{
	private int start;
	private int end;
	

	public MyTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum=sum+i;
		}
		System.out.println(Thread.currentThread().getId()+"-->"+start+"-->"+end+"="+sum);
		return sum;		
	}

}
