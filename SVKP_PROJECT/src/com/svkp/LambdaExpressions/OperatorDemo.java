package com.svkp.LambdaExpressions;
@FunctionalInterface
interface Operator {
	public void operate(int num);
}
public class OperatorDemo {

	public static void main(String[] args) {
		Operator op=num->System.out.println("increasing num by 2:"+(num+2));
		op.operate(20);
	}

}
