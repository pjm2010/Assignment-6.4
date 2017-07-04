package com.BankAtm;

public class Bank {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double balance=0;
		double deposit=0;
		double withdraw=0;
		int bankId=0;
		String bankNme;
		String loc;
		
		//1st object
		BankAtm bank=new BankAtm();
		bankId=bank.atmID=123;
		System.out.println("The ID of the bank is "+bankId);
		bankNme=bank.bankName="SBI";
		System.out.println("The name of the bank is "+bankNme);
		loc=bank.location="Bhubaneswar";
		System.out.println("The location of the bank is "+loc);		
		bank.balance=23000; //Defining the balance for the account
		deposit=1000;
		bank.deposit(deposit); //Deposited extra to the existing amount
		
		System.out.println("*****************************************************************************************");
		System.out.println();
		
		//2nd Object
		BankAtm bank1=new BankAtm();
		bankId=bank1.atmID=13;
		System.out.println("The ID of the bank is "+bankId);
		bankNme=bank1.bankName="AXIS";
		System.out.println("The name of the bank is "+bankNme);
		loc=bank1.location="Cuttak";
		System.out.println("The location of the bank is "+loc);	
		bank1.balance=3400;
		try {
			balance=bank1.withdraw(123);
			System.out.println("The balance after the withdrawl is "+balance);
		} catch (BankATMException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("*****************************************************************************************");
		System.out.println();
		
		BankAtm bank2=new BankAtm();
		bankId=bank2.atmID=2010;
		System.out.println("The ID of the bank is "+bankId);
		bankNme=bank2.bankName="ICICI";
		System.out.println("The name of the bank is "+bankNme);
		loc=bank2.location="TALCHER";
		System.out.println("The location of the bank is "+loc);	
		bank2.balance=800;
		balance=bank2.deposit(100); //Deposited to existing balance
		System.out.println("The amount after deposting is " +balance); //Displaying the existing balance
		try {
			balance=bank2.withdraw(233);
			System.out.println("The available balance after the withdrwal is "+balance);
		} catch (BankATMException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("*****************************************************************************************");
		System.out.println();
	
		
		
	}

}
