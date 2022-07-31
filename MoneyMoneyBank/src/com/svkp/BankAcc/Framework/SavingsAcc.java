package com.svkp.BankAcc.Framework;

public class SavingsAcc extends BankAcc {
	public boolean isSalary;
	public SavingsAcc(int accNo, String accName, float accBal,boolean isSalary) {
		super(accNo, accName, accBal);
		this.isSalary=isSalary;
	}
	public void withdraw(float accBal) {
		
	}
	@Override
	public String toString() {
		return "SavingsAcc [isSalary=" + isSalary + "]";
	}
	
}
