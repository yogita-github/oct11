package com.demo.threads;

import com.demo.beans.SearchData;

public class MySearchThread extends Thread{
	private SearchData sdata;
	private String wrd;
	
	public MySearchThread(SearchData sdata, String wrd) {
		super();
		this.sdata = sdata;
		this.wrd = wrd;
	}

	public void run() {
		boolean status=sdata.search("words.txt", wrd);
		if(status) {
			System.out.println("Word found "+wrd);
		}else {
			System.out.println("Word not found "+wrd);
		}
	}
	
}
