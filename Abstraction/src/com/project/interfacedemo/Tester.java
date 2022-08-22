package com.project.interfacedemo;

public class Tester {
	public static void main(String[] args) {
		SBiImpl impl=new SBiImpl();
		impl.addKycDetails();
		impl.applyCreditCard();
		impl.deposit();
		impl.applyDebitCard();
		impl.applyLoan();
		impl.checkMinimumBalance();
		impl.internetBanking();
	}

}
