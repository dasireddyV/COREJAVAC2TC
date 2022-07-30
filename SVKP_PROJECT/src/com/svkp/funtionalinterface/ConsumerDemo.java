package com.svkp.funtionalinterface;

import java.util.function.Consumer;

//void accept(T t);
public class ConsumerDemo 
{
 public static void main(String[] args) 
{
  Consumer<Integer> multiplier = num -> System.out.println(num*num);
  multiplier.accept(10);
  multiplier.accept(4);
 }
}
