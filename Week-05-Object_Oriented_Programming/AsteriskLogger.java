package com.promineotech.week05;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");

	}

	@Override
	public void error(String err) {
		System.out.println("****************");
		System.out.println("***Error: " + err + "***");
		System.out.println("****************");

	}

}
