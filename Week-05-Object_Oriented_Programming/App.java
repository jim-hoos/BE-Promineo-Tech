package com.promineotech.week05;

public class App {

	public static void main(String[] args) {
		Logger asterickLogger = new AsteriskLogger();
		String string1 = "Hello";
		String string2 = "Hockey is the best!";
				
		System.out.println("AsterickLogger");
		System.out.println("--------------");
		
		asterickLogger.log(string1);
		asterickLogger.log(string2);
		System.out.println();
		asterickLogger.error(string1);
		asterickLogger.error(string2);
		
		System.out.println("\nSpacedLogger");
		System.out.println("------------");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log(string1);
		spacedLogger.log(string2);
		System.out.println();
		spacedLogger.error(string1);
		spacedLogger.error(string2);
		
	}

}
