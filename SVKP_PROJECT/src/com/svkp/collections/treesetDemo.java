package com.svkp.collections;

import java.util.TreeSet;

public class treesetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tt=new TreeSet<Integer>();
		tt.add(10);
		tt.add(4);
		tt.add(6);
		tt.add(5);
		tt.add(1);
		System.out.println(tt);//prints in ascending order
	}

}
