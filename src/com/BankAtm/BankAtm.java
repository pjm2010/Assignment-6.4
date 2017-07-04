package com.BankAtm;

public class BankAtm {
	int atmID;
	String bankName;
	String location;
	double balance;
	
	double withdraw(double amt) throws BankATMException{
		
		if(balance<amt || balance <1000 ){
			throw new BankATMException("Insufficient amount hence cannot withdraw.Sorry :(");
		}
		else{
			balance=balance-amt;
		}
		return balance;
	}
	
	double deposit(double amt){
		
		balance=balance+amt;
		return balance;
	}
	
	
}
