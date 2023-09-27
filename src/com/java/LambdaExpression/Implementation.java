package com.java.LambdaExpression;
// Functional Interface    implementation using lambda expression with parameters.
public class Implementation implements CarSpeed {

	@Override
	public int speed(int a, int b) {
		System.out.println("........");
		return 0;
	}
	
	public static void main(String[] args) {
		CarSpeed cs = ( a,  b)-> (a+b); 
		int c= 	cs.speed(20, 30);
		System.out.println("from Lambda "+ c);
	
	};

}
