package com.svkp.LambdaExpressions;
interface addinf{
	public void add(int a,int b);
}
public class LEDemo {

	public static void main(String[] args) {
		addinf obj=(int a,int b)->System.out.println("The sum is:"+(a+b));
		obj.add(10, 20);
		addinf sub=(int a,int b)->System.out.println("substraction is:"+(a-b));
		sub.add(20, 10);
		addinf mul=(int a,int b)->System.out.println("multiplication  is:"+(a*b));
		mul.add(20, 10);
		addinf div=(int a,int b)->System.out.println("Division is:"+(a/b));
		div.add(20, 10);
	}

}