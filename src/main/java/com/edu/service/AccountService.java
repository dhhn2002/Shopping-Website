package com.edu.service;

import java.util.List;

import com.edu.entity.Account;

public interface AccountService {
	List<Account> findAll();
	Account findById(String username);
	List<Account> getAdministrators();
}
