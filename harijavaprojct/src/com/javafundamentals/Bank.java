package com.javafundamentals;


 class Bank {
	String accountholdarname;
	long accountnumber1;
	String password1;
	 static double balance1;
	 

	 void valuescreateaccount(String name,long accountnumber,String password,double balance){
		 accountholdarname = name;
		 accountnumber1 = accountnumber;
		password1=password;
		 balance1=balance;
		
	}
	 double deposit (double amount ) {
		 balance1 = (balance1+amount);
		 return balance1;
		 
	 }
	 
	
	 double withdraw (double amount) {
		 balance1 = balance1-amount;
		 return balance1;
	 }
	 
	 
	 
	 static double checkbalance (Bank acc)	{
		 return Bank.balance1;
		 
	} 
 }
 class bankaccount  {
	 
	public static void main(String[] args) {
		Bank b =new Bank();
		 
		
		b.valuescreateaccount("unknown",123456789012l,"@@@",12000);
		  
		System.out.println(b.balance1);
		
		
		double a1 = (b.withdraw(3000));
		
		System.out.println(a1); 
		
		double a2 = (b.deposit(2000));
		System.out.println(a2);
		
		double a3 = (Bank.checkbalance(b));
		System.out.println(a3);
		
	 }
 	}
  
		

