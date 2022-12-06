package com.masai;

public class Bank {

	private Bank() {
		System.out.println("Inside Private constructor of Bank");
	}
	public static Bank method1() {
		
		return new Bank();
		
	}
	
}
