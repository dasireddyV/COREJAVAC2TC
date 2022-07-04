package com.svkp.exception;
class Balance extends Exception{
	public Balance(String q) {
		super(q);
	}
}
public class UserException {
    void balanceCheck(int b)throws Balance{
    	if(b<500) {
    		throw new Balance("balance needed");
    	}
    	else {
    		System.out.println("enough balance");
    	}
    }
	public static void main(String[] args) {
	UserException obj = new UserException();
	try {
		obj.balanceCheck(600);
	}catch(Balance x) {
		System.out.println("Add balance");
	}
	}

}
