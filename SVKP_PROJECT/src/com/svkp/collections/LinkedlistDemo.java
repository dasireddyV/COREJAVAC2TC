package com.svkp.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("venky");
		ll.add("ajay");
		ll.add("varun");
		System.out.println(ll);
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
