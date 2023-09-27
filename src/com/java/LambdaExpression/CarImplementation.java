package com.java.LambdaExpression;

public  abstract class CarImplementation  implements Car {
	
	@Override
	public void lights() {
		System.out.println("lights");
		
	}

	@Override
	public void horn() {
		System.out.println("horns");
		
	}

	@Override
	public void music() {
		System.out.println("music");
		
	}

	@Override
	public void doors() {
		System.out.println("doors");
		
	}

	

}
