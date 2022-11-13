package com.atimsa.practical;

public class SingletoneDemo {
	public static SingletoneDemo singletone;
	int x=10;
 SingletoneDemo() {
		
	}

	public  static SingletoneDemo getSingletone() {
		return singletone;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SingletoneDemo s= new SingletoneDemo();
		SingletoneDemo clone = (SingletoneDemo)s.clone();
		System.out.println(s.hashCode());
		System.out.println(s.hashCode());
	}

}
