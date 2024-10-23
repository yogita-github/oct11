package com.demo.threads;

import com.demo.beans.Storage;

public class Consumer extends Thread{
    private Storage s;
    
	public Consumer(Storage s) {
		super();
		this.s = s;
	}

	public void run() {
		for(int i=1;i<=10;i++) {
			
			s.get();
		}
	}
}
