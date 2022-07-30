package com.svkp.funtionalinterface;

import java.util.function.Predicate;

//boolean Test(T t);
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String>stringChecker=str->str.isEmpty();
		String s="Predicate";
		boolean result=stringChecker.test(s);
		System.out.println(s+" "+"is empty:"+" "+result);
	}

}
