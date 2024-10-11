package com.demo.service;

public class LoginServiceImpl implements LoginService{

	@Override
	public String autheticate(String uname, String pass) {
		if(uname.equals("user1") && pass.equals("user1"))
		   return "user";
		else if(uname.equals("admin1") && pass.equals("admin1"))
			return "admin";
		else
			return null;
	}

}
