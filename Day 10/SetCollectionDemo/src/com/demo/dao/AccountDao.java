package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Account;

public interface AccountDao {

	boolean saveaccount(Account ac);

	Set<Account> findAll();

	Account findById(String acid, int pin);

	Account getById(String dacid);

	boolean removeAccount(String acid, int pin);

	Set<Account> sortById();

	List<Account> sortByName();

}
