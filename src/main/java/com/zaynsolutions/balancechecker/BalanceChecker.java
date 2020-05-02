package com.zaynsolutions.balancechecker;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BalanceChecker {

	@Autowired
	Account account;

	@RequestMapping("/balance")
	public String balaceChecker() {
		System.out.println(LocalDateTime.now()+":/balance url is called:");
		return ""+account;
	}

	@RequestMapping("/")
	public String index() {
		System.out.println(LocalDateTime.now()+":/ url is called:");
		return "Balance Checker Application!";
	}

}