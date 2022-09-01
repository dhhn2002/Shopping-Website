package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.AccountDAO;
import com.edu.entity.Account;
import com.edu.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountDAO dao;

	@Override
	public Account findById(String username) {
		return dao.findById(username).get();
	}
	
	@Override
	public List<Account> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Account> getAdministrators() {
		return dao.getAdministators();
	}
}
