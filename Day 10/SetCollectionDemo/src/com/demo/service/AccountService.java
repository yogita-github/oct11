package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Account;

public interface AccountService {

	boolean addnewAccount(int ch);

	Set<Account> getAll();

	int withdrawAmount(String acid, int pin, double amt);

	boolean depositAmount(String acid, int pin, double amt);

	boolean transferfunds(String acid, String dacid, int pin, double amt);

	boolean modifypinnum(String acid);

	boolean removeAccountById(String acid, int pin);

	Set<Account> sortById();

	List<Account> sortByName();

}
