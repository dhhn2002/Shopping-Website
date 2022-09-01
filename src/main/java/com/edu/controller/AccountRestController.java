package com.edu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.entity.Account;
import com.edu.service.AccountService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
	@Autowired
	AccountService accountService;
	
	public List<Account> getAccounts(@RequestParam("admin") Optional<Boolean> admin)
	{
		if(admin.orElse(false))
		{
			return accountService.getAdministrators();
		}
		return accountService.findAll();
	}
}
