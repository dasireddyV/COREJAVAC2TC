package com.svkp.BankAcc.Application;

import com.svkp.BankAcc.Framework.SavingsAcc;

public class MMSavingsAcc extends SavingsAcc {
	public static final float minBal=100;
	public MMSavingsAcc(int accNo, String accName, float accBal, boolean isSalary) {
		super(accNo, accName, accBal, isSalary);
	}
	public void withdraw(float minBal) {
		System.out.println("Dear savings account user, your minimum balance is:"+minBal);
	}
	@Override
	public String toString() {
		return "MMSavingsAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal
				+ "]";
	}
	
}
