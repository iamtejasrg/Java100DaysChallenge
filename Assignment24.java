/*Assignment 24 : 15th May 2022
WAP to sum all the numbers in given string, without using Character class method. 
(Note : Use Ascii value concept) .
Input: J7u9y8h1h8j4b7j3j6
Ouput: Sum of all numbers in String is - 54.*/


import java.util.Scanner;

public class Assignment24 {

	int asciiForIntegers(char intValueAsChar) {
		int ascciForintValue = intValueAsChar;
		return ascciForintValue;
	}

	// Using normal for loop
	int sumOfNumbersInString1(String stringInput) {
		int sum = 0;
		for (int index = 0; index < stringInput.length(); index++) {
			if (asciiForIntegers(stringInput.charAt(index)) >= 48 && asciiForIntegers(stringInput.charAt(index)) <= 57) {
				int intInString = Integer.parseInt(String.valueOf(stringInput.charAt(index)));
				sum += intInString;
			}
		}
		return sum;
	}

	// Using Enhanced for loop
	int sumOfNumbersInString2(String stringInput) {
		char[] inputAsCharArray = stringInput.toCharArray();
		int sum = 0;
		for (char inputChar : inputAsCharArray) {
			if (asciiForIntegers(inputChar) >= 48 && asciiForIntegers(inputChar) <= 57) {
				int intInString = Integer.parseInt(String.valueOf(inputChar));
				sum += intInString;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string having integer numbers:-");
		String inputString = scanner.next();
		// System.out.println("Sum of all numbers present in user defined string: "+assignment24.sumOfNumbersInString1(inputString));
		System.out.println("Sum of all numbers present in user defined string: "+ assignment24.sumOfNumbersInString2(inputString));
		scanner.close();
	}
}