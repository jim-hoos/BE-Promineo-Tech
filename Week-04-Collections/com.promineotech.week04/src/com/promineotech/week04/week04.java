package com.promineotech.week04;

public class week04 {

	public static void main(String[] args) {
		// Coding step 1
		// provide list of ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// Coding step 1a
		// subtract the first age from the last
		ages[ages.length - 1] -= ages[0];
		System.out.print("(1a) Ages are ");
		for (int age : ages) {
			System.out.print(age + " ");
		}
		System.out.print("\n");
		
		// Coding step 1b and 1bi
		// provide list of ages
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 46};
		// Coding step 1bii
		// subtract the first age from the last
		ages2[ages2.length - 1] -= ages2[0];
		
		// Coding step 1c
		double aveAge;
		double sumAge = 0;
		// get sum of ages
		for (int age : ages2) {
			sumAge += age;
		}
		// average age is sum divided by # items
		aveAge = sumAge / ages2.length;
		System.out.println("(1c) Average age is " + aveAge);
		
		// Coding step 2 and 2a
		// provide the list of names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double aveLetters;
		double sumAveLtrs = 0;
		for (String name : names) {
			sumAveLtrs += name.length();
		}
		// average # of letters is sum of letters divided by # items
		aveLetters = sumAveLtrs / names.length;
		System.out.println("(2a) Average # of letters is " + aveLetters);
		
		// Coding step 2b
		String concatNames = "";
		int namesLength = names.length;
		int i = 0;
		// concatenate the names by adding each name to concatNames
		for (String name : names) {
			concatNames += name;
			if (++i < namesLength) {
				concatNames += " ";
			}
		}
		System.out.println("(2b) Concatenated name is " + concatNames);
		
		// Coding step 3
		// Last Element of an array is accessed by
		//	using an index of the length property value and subtracting 1
		//  e.g., names[names.length - 1]
		
		// Coding step 4
		// First Element of an array is accessed by
		//	using the zero index
		//  e.g., names[0]
		
		// Coding step 5
		int[] nameLengths = new int[names.length];
		// loop through the names list and store each corresponding
		// length in nameLengths
		for (int j = 0; j < namesLength; j++) {
			nameLengths[j] = names[j].length();
		}		
	
		// Coding step 6
		int sumNameLengths = 0;
		// sum up the nameLengths as sumNameLengths
		for (int length : nameLengths) {
			sumNameLengths += length;
		}
		System.out.println("(6) namelengths sum is " + sumNameLengths);
		
		// Coding step 7
		System.out.println("(7) Concatenated word string is " + wordConcatenate("Hello", 3));
		
		// Coding step 8
		System.out.println("(8) Full name is " + fullName("Tom", "Jones"));
		
		// Coding step 9
		//int[] intArray = {1, 13, 20, 30, -9, 16, 8}; // less
		int[] intArray = {51, 2, -12, 17, 33, 10}; // greater
		System.out.println("(9) Sum of the int array is " +
				(sumGreaterThan100(intArray) ? "greater " : "less ") +
				"than 100");
		
		// Coding step 10
		double[] dblArray = {1.4, 5.3, 7.8, -0.4, 9.0, 2.8};
		System.out.println("(10) Average of the double array is " +
				averageOfDoubles(dblArray));
		
		// Coding step 11
		double[] dblArray1 = {1.4, 5.3, 7.8, -0.4, 9.0, 2.8};
		//double[] dblArray2 = {0.2, 5.9, 3.8, 4.4, 6.0, 1.8}; // greater
		double[] dblArray2 = {5.2, 5.9, 3.8, 4.4, 6.0, 1.8}; // less
		System.out.println("(11) Array 1 average is " +
				(firstArrayGreater(dblArray1, dblArray2) ? "greater " : "less ") +
				"than Array 2 average");
		
		// Coding step 12
		//System.out.println("(12) willBuyDrink is " + willBuyDrink(true, 9.99));
		System.out.println("(12) willBuyDrink is " + willBuyDrink(false, 10.99));
		//System.out.println("(12) willBuyDrink is " + willBuyDrink(true, 10.99));
		
		// Coding step 13
		// timeForPizza - if oven temperature is 400 and time in oven is 20
		//                  minutes and frozen pizza brand is DiGiorno then
		//					return true else return false
		// Created this method because I was hungry for pizza and these are
		//   the requirements.
		System.out.println("(13) timeForPizza is " + timeForPizza(400, 20, "DiGiorno"));
		//System.out.println("(13) timeForPizza is " + timeForPizza(400, 20, "Tombstone"));
	}
	
	// Coding step 7
	public static String wordConcatenate(String word, int n) {
	
		String concatWord = "";
		// loop through n times and concatenate word to concatWord
		for (int i = 0; i < n; i++) {
			concatWord += word;
		}
		return concatWord;
	}
	
	// Coding step 8
	public static String fullName(String firstName, String lastName) {
		// display full name as first name plus space plus last name
		return firstName + " " + lastName;
	}
	
	// Coding step 9
	public static boolean sumGreaterThan100(int[] array) {
		int sum = 0;
		// add each array element to sum
		for (int val : array) {
			sum += val;
		}
		// check if greater than 100
		return sum > 100;
	}
	
	// Coding step 10
	public static double averageOfDoubles(double[] array) {
		double sum = 0;
		// add each array element to sum
		for (double val : array) {
			sum += val;
		}
		// divide sum by # of items to get average
		return sum / array.length;		
	}

	// Coding step 11
	public static boolean firstArrayGreater(double[] array1, double[] array2) {
		// use averageOfDoubles() and compare results from array1 to array2
		return averageOfDoubles(array1) > averageOfDoubles(array2);
	}
	
	// Coding step 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		// if isHotOutside and moneyInPocket is greater than 10.50 return true else false
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	// Coding step 13
	public static boolean timeForPizza(int temp, int timeInMins, String pizzaBrand) {
		// if temperature is 400 and time in mins is 20 and pizza is DiGiorno than return true
		return temp == 400 && timeInMins == 20 && pizzaBrand.equals("DiGiorno");
	}
}
