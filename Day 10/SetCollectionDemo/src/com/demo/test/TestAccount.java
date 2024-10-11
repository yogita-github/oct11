package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountService acservice=new AccountServiceImpl();
		LoginService lservice=new LoginServiceImpl();
		System.out.println("enter username");
		String uname=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		String role=lservice.autheticate(uname,pass);
		int choice=0;
		if(role.equals("user")) {
			do {
			   System.out.println("1.Open new account\n2. withdraw amt\n3. deposit amount\n4. transfer funds\n");
			   System.out.println("5.change pin\n6. check balance\n7. close account\n8. display all\n9 exit\nchoice");
			   choice=sc.nextInt();
			   switch(choice) {
			   case 1->{
				   System.out.println("1. Saving\n 2. Current\n choice: ");
				   int ch=sc.nextInt();
				   boolean status=acservice.addnewAccount(ch);
				   if(status) {
					   System.out.println("Account opening done");
				   }else{
					   System.out.println("error occured");
				   }
			   }
			   case 2->{
				   System.out.println("enter acid");
				   String acid=sc.next();
				   System.out.println("enetr pin");
				   int pin=sc.nextInt();
				   System.out.println("enter amt to withsraw");
				   double amt=sc.nextDouble();
				   int ans=acservice.withdrawAmount(acid,pin,amt);
				   if(ans==1) {
					   System.out.println("withdrawal done");
				   }else if(ans==2) {
					   System.out.println("insuffitient balance");   
				   }else {
					   System.out.println("wrong credentials");
				   }
				   
			   }
			   case 3->{
				   System.out.println("enter acid");
				   String acid=sc.next();
				   System.out.println("enetr pin");
				   int pin=sc.nextInt();
				   System.out.println("enter amt to deposit");
				   double amt=sc.nextDouble();
				   boolean status=acservice.depositAmount(acid,pin,amt);
				   if(status) {
					   System.out.println("deposit done");
				   }else {
					   System.out.println("wrong credentials");
				   }
			   }
			   case 4->{
				    System.out.println("enter acid of source account");
			   		String acid=sc.next();
			   	    System.out.println("enter acid of destination account");
			   		String dacid=sc.next();
			   		System.out.println("enetr pin");
			   		int pin=sc.nextInt();
			   		System.out.println("enter amt to transfered");
			   		double amt=sc.nextDouble();
			   		boolean status=acservice.transferfunds(acid,dacid,pin,amt);
			   		if(status) {
			   			System.out.println("transfer done");
			   			
			   		}else {
			   			System.out.println("transfer failed");
			   		}
			   
			   }
			   case 5->{
				   System.out.println("enter acid to change the pin");
			   		String acid=sc.next();
			   	    System.out.println("do you want to enter old pin");
			   		String ans=sc.next();
			   		if(ans.equals("y")) {
			   		     System.out.println("enetr pin");
			   		     int pin=sc.nextInt();
			   		     //write code for changing the pin
			   		}else {
			   			 boolean status=acservice.modifypinnum(acid); 
			   			 if(status) {
			   				System.out.println("pin changed");
			   			 }else {
			   				System.out.println("cannot change pin, wrong credentials"); 
			   			 }
			   		}
			   }
			   case 6->{ //write code to display balance
				   }
			   
			   case 7->{
				   System.out.println("enter acid");
				   String acid=sc.next();
				   System.out.println("enetr pin");
				   int pin=sc.nextInt();
				   boolean status=acservice.removeAccountById(acid,pin);
				   if(status) {
					   System.out.println("account is closed, balance is given to user");
				   }else {
					   System.out.println("error in account closing");
				   }
			   }
			   case 8->{
				   Set<Account> sac=acservice.getAll();
				   sac.stream().forEach(System.out::println);
			   }
			   case 9->{
				   System.out.println("thank you for visiting...");
				   sc.close();
			   }
			   default->System.out.println("wrong choice");
			   }
			}while(choice!=9);
		}else if(role.equals("admin")) {
			do {
				System.out.println("1. Display All account\n2. display in sorted order by id\n3. display in sorted order by name\n");
				System.out.println("4. exit\n choice: ");
				choice=sc.nextInt();
				switch(choice) {
				case 1->{
					Set<Account> aset=acservice.getAll();
					aset.stream().forEach(System.out::println);
				}
				case 2->{
					Set<Account> aset=acservice.sortById();
					aset.stream().forEach(System.out::println);
				}
				case 3->{
					List<Account> aset=acservice.sortByName();
					aset.stream().forEach(System.out::println);
				}
				case 4->{System.out.println("thank you for visiting.....");
				sc.close();}
				default->{System.out.println("wrong choice");}
				
				}
			}while(choice!=4);
		}else {
			System.out.println("wrong credentials");
		}
	}

}
