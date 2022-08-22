package com.project.interfacedemo;

public interface BankDao {
	//we cannot implement concrete()
	void withdraw();
	void deposit();
	void checkMinimumBalance();
	void applyLoan();
	void addKycDetails();
	void applyCreditCard();
	void applyDebitCard();
	void internetBanking();
	
}
