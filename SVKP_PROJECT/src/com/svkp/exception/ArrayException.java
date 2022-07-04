package com.svkp.exception;

public class ArrayException {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		try {
			System.out.println(a[4]);
		}
		catch(Exception e) {
		System.out.println("value is out of range");
	}
}
}
