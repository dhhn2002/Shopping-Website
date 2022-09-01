package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.AccountDAO;
import com.edu.dao.AuthorityDAO;
import com.edu.entity.Account;
import com.edu.entity.Authority;
import com.edu.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	@Autowired
	AuthorityDAO dao;
	
	@Autowired
	AccountDAO acdao;
	
	public List<Authority> findAll(){
		return dao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministators();
		return dao.authoritiesOf(accounts);
	}
}
