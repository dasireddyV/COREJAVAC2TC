package com.svkp.BankAcc.Framework;

public class CurrentAcc extends BankAcc{
	public final float creditLimit;
	public CurrentAcc(int accNo, String accName, float accBal,float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit=creditLimit;
	}
	public void withdraw(float accBal) {
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
}
