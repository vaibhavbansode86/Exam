package com.atimsa.oops;

public class Division extends Abstraction{
	int div;
	
	public int division(int a, int b) {
		this.div=a/b;
		return this.div;
	}

	public static void main(String[] args) {
		Division d=new Division();
		d.div=d.division(20, 10);
		
		System.out.println(d.div);
		
		int product = d.product(10,20);
		System.out.println(product);
				
	}

}
