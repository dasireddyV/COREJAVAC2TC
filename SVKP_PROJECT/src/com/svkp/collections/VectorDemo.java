package com.svkp.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vv= new Vector<String>();
		vv.add("joyce");
		vv.add("john");
		vv.add("Ashish");
		vv.add("Ashish");
		Iterator<String> itr=vv.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
