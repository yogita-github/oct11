package com.demo.service;

import com.demo.dao.AccountDaoImpl;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;
import com.demo.dao.AccountDao;


public class AccountServiceImpl implements AccountService{
        private AccountDao acdao;
        public AccountServiceImpl() {
        	acdao=new AccountDaoImpl();
        }
		@Override
		public boolean addnewAccount(int ch) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			String nm=sc.next();
			System.out.println("Enter 4 digit pin");
			int pin=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter secrete question");
			String question=sc.nextLine();
			System.out.println("Enter answer");
			String ans=sc.next();
			System.out.println("Enter amount to be deposited");
			double amt=sc.nextDouble();
			if(ch==1) {
				System.out.println("Enter chequebook number");
				int cnum=sc.nextInt();
				Account ac=new SavingAccount(nm,pin,question,ans,amt,cnum);
				return acdao.saveaccount(ac);
			}else if(ch==2) {
				System.out.println("Enter number of transactions");
				int tnum=sc.nextInt();
				Account ac=new CurrentAccount(nm,pin,question,ans,amt,tnum);
				return acdao.saveaccount(ac);
			}
			return false;
			
		}
		@Override
		public Set<Account> getAll() {
			return acdao.findAll();
		}
		@Override
		public int withdrawAmount(String acid, int pin, double amt) {
			Account ac=acdao.findById(acid,pin);
			if(ac!=null) {
				return ac.withdraw(amt);
			}else {
				return 3;
			}
		}
		@Override
		public boolean depositAmount(String acid, int pin, double amt) {
			Account ac=acdao.findById(acid,pin);
			if(ac!=null) {
				ac.deposit(amt);
				return true;
			}else {
				return false;
			}
		}
		@Override
		public boolean transferfunds(String acid, String dacid, int pin, double amt) {
			Account ac=acdao.findById(acid,pin);
			Account dacc=acdao.getById(dacid);
			if(ac!=null && dacc!=null) {
				int ans=ac.withdraw(amt);
				if(ans==1) {
					dacc.deposit(amt);
					//transfer done
					return true;
				}
				//insufitient balance
				return false;
			}
			//account not found
			return false;
		}
		@Override
		public boolean modifypinnum(String acid) {
			Scanner sc=new Scanner(System.in);
			Account acc=acdao.getById(acid);
			if(acc!=null) {
				System.out.println(acc.getQuestion());
				String ans=sc.next();
				if(acc.getAns().equals(ans)) {
					System.out.println("enter new pin");
					int newpin=sc.nextInt();
					acc.setPin(newpin);
					return true;
				}
				return false;
			}
			return false;
		}
		@Override
		public boolean removeAccountById(String acid, int pin) {
				return acdao.removeAccount(acid,pin);
				
			
		}
		@Override
		public Set<Account> sortById() {
			return acdao.sortById();
		}
		@Override
		public List<Account> sortByName() {
			return acdao.sortByName();
		}
}
