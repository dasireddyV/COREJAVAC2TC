package com.svkp.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int result=a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero error");
		}
	}

}
