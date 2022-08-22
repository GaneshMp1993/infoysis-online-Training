package com.project.interfacedemo;

public class SBiImpl implements BankDao {

	@Override
	public void withdraw() {
		System.out.println("SBiImpl.withdraw()");
		
	}

	@Override
	public void deposit() {
		System.out.println("SBiImpl.deposit()");
		
	}

	@Override
	public void checkMinimumBalance() {
		System.out.println("SBiImpl.checkMinimumBalance()");
		
	}

	@Override
	public void applyLoan() {
		System.out.println("SBiImpl.applyLoan()");
		
	}

	@Override
	public void addKycDetails() {
		System.out.println("SBiImpl.addKycDetails()");
		
	}

	@Override
	public void applyCreditCard() {
		System.out.println("SBiImpl.applyCreditCard()");
		
	}

	@Override
	public void applyDebitCard() {
		System.out.println("SBiImpl.applyDebitCard()");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("SBiImpl.internetBanking()");
		
	}

}
