package com.svkp.collections;

import java.util.HashMap;

public class hashMapdemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "hello");
		map.put(2, "world");
		map.put(3, "welcometo");
		map.put(4, "Fullstack");
		map.putIfAbsent(5, "Devolopement");
		map.replace(1, "hello", "Hello");
		System.out.println(map);
	}

}
