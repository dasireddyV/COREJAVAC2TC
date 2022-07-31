package com.svkp.BankAcc.Framework;

public interface BankFactory {
	public abstract SavingsAcc getNewSavingsAcc(int accNo,String accName,float accBal,boolean isSalary);
	public abstract CurrentAcc getNewCurrentAcc(int accNo,String accName,float accBal,float creditLimit);
}
