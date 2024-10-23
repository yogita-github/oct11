package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchData {
	
	public boolean search(String fname,String wrd) {
		try(BufferedReader br=new BufferedReader(new FileReader(fname));){
			String s=br.readLine();
			while(s!=null) {
				//System.out.println(s);
				if(s.equals(wrd)) {
					return true;
				}
				s=br.readLine();
			}
			return false;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
