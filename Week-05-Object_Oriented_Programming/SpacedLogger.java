package com.promineotech.week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String spaced = "";
		for (int i = 0; i < log.length(); i++) {
			spaced += log.charAt(i) + " ";
		}
		spaced = spaced.stripTrailing();
		System.out.println(spaced);

	}

	@Override
	public void error(String err) {
		String spaced = "";
		for (int i = 0; i < err.length(); i++) {
			spaced += err.charAt(i) + " ";
		}
		spaced = spaced.stripTrailing();
		System.out.println("ERROR: " + spaced);	

	}

}
