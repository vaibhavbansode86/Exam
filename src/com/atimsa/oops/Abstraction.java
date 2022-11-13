package com.atimsa.oops;

public abstract class Abstraction {
	int prod;
	
	public int product(int a,int b) {
		this.prod=a*b;
		return this.prod;
	}
	
	public abstract int division(int a,int b);

}
