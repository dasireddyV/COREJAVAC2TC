package com.svkp.exception;

public class userException_II extends Exception {
	private static int accno[]= {101,102,103,104};
	private static String name[]= {"alex","john","george","alan"};
	private static double bal[]= {1000.0,898.50,1220.30,1450.25};
	userException_II(String str){
		super(str);
	}

	public static void main(String[] args) {
		try {
	System.out.println("accno"+"\t"+"name"+"\t"+"bal");
	for(int i=0;i<4;i++) {
		System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
		if(bal[i]<1000) {
			userException_II ex=new userException_II("Balance is less than 1000 for:"+accno[i]);
			throw ex;
		}
	}
   }
		catch(Exception e) {
			e.printStackTrace();
		}
 }
}
