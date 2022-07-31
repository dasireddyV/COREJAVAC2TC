package com.svkp.BankAcc.Application;

import com.svkp.BankAcc.Framework.BankFactory;
import com.svkp.BankAcc.Framework.CurrentAcc;
import com.svkp.BankAcc.Framework.SavingsAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public MMSavingsAcc getNewSavingsAcc(int accNo, String accName, float accBal, boolean isSalary) {
		MMSavingsAcc mmsavings=new MMSavingsAcc(accNo,accName,accBal,isSalary);
		return mmsavings;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo,accName,accBal,creditLimit);
		return mmcurrent;
	}

}
