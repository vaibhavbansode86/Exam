package com.atimsa.oops;

public class Encapsulation {
	private int sum;
	
	public int getSum() {
		return this.sum;
	}
	
	public void add(int a, int b) {
		this.sum=a+b;
	}
	
	
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.add(10, 20);
		System.out.println(e.getSum());

	}

}
