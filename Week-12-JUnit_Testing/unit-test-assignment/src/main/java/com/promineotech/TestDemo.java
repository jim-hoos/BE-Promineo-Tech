package com.promineotech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		
	}

	// similar to addPositive, multiplyPositive first checks if both params are positive
	// if check passes, then the two params are multiplied by each other
	public int multiplyPositive(int a, int b) {
		if (a > 0 && b > 0) {
			// return the product of a and b
			return a * b;
		} else {
			// a or b is not positive so throw exception
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		
	}
	
	public int randomNumberSquared() {
		int r = getRandomInt();
		return r * r;
	}
	
	int getRandomInt() {
	    Random random = new Random();
	    return random.nextInt(10) + 1;
	}
}
