package com.atimsa.oops;

public class Calculation extends Encapsulation {
	int sub;
	public int substraction(int a, int b) {
		this.sub=a-b;
		return this.sub;
	}

	public static void main(String[] args) {
		int sub;
		Calculation c =new Calculation();
		sub=c.substraction(20, 10);
		c.add(20, 10);
		System.out.println(c.getSum());	
		System.out.println(sub);
	}

}
