package com.svkp.BankAcc.Application;

import com.svkp.BankAcc.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
	}
	public void withdraw(float accBal) {
		System.out.println("Dear current account user, your account balance is:"+" "+accBal+" "+"with creditlimit is:"+creditLimit);
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accName=" + accName + ", accBal="
				+ accBal + "]";
	}
	
}
