package com.tcs.springex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
       
	
	@GetMapping("/mybalance")
	public String getBalance() {
		return "This is your balance details......";
	}
}