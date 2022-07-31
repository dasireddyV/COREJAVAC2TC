package com.svkp.BankAcc.Client;

import com.svkp.BankAcc.Application.MMBankFactory;
import com.svkp.BankAcc.Application.MMCurrentAcc;
import com.svkp.BankAcc.Application.MMSavingsAcc;

public class Client {

	public static void main(String[] args) {
		//step a
		MMBankFactory mmbfactory=new MMBankFactory();
		mmbfactory.getNewSavingsAcc(0, null, 0, false);
		//step b
		MMSavingsAcc mmsavings=new MMSavingsAcc(1001,"john",800f,true);
		//step c
		MMCurrentAcc mmcurrent=new MMCurrentAcc(1002,"george",1000f,100f);
		//step d
		mmsavings.withdraw(100f);
		mmcurrent.withdraw(200f);
		//step e
		System.out.println(mmsavings.toString());
		System.out.println(mmcurrent.toString());
	}

}
