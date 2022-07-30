package com.svkp.LambdaExpressions;
@FunctionalInterface
interface opSum{
	public int operate(int num1,int num2);
}
public class OperatorSum {

	public static void main(String[] args) {
		opSum s=(num1,num2)->num1+num2;
		int sum=s.operate(10, 20);
		System.out.println("sum:"+sum);
	}

}
