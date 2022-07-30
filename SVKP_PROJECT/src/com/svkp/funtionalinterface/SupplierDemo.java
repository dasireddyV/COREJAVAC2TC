package com.svkp.funtionalinterface;

import java.util.Random;
import java.util.function.Supplier;

//T get();
public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Double> RandomNumberSupplier=()-> new Random(10).nextDouble();
		System.out.println(RandomNumberSupplier.get());
		System.out.println(RandomNumberSupplier.get());
	}

}
