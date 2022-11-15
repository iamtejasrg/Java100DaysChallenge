public class Assignment32 {

	// Program 1 : Compare two strings without using equals/equalsIgnoreCase method
	boolean compareStrings(String string1, String string2) {
		boolean isEqual = true;
		if (string1.length() == string2.length()) {
			for (int index = 0; index < string1.length(); index++) {
				if (string1.charAt(index) != string2.charAt(index)) {
					isEqual = false;
				}
			}
		} else {
			isEqual = false;
		}
		return isEqual;
	}

	// Program 2 : Remove all white space without using replace method.
	String removeWhiteSpaces(String inputString) {
		String newString = "";
		for (int index = 0; index < inputString.length(); index++) {
			// if (Character.isLetterOrDigit(inputString.charAt(index))) {
			if (inputString.charAt(index) != ' ') {
				newString += inputString.charAt(index);
			}
		}
		return newString;
	}

	// Program 3 : Arrange String specific format : lowercase+digits+uppercase
	String stringInLowerDigitUpper(String inputString) {
		String allLowerCase = "";
		String allDigits = "";
		String allUpperCase = "";
		for (int index = 0; index < inputString.length(); index++) {
			if (Character.isLowerCase(inputString.charAt(index)))
				allLowerCase += inputString.charAt(index);
			else if (Character.isDigit(inputString.charAt(index)))
				allDigits += inputString.charAt(index);
			else if (Character.isUpperCase(inputString.charAt(index)))
				allUpperCase += inputString.charAt(index);
		}
		String newString = allLowerCase + allDigits + allUpperCase;
		return newString;
	}

	// Program 4 : Find the first non repeating special characters.
	char nonRepeatingSepecialChar(String inputString) {
		char nonRepeatFirstSpecial = ' ';
		int OriginalL = inputString.length();
		for (int index = 0; index < inputString.length(); index++) {
			char currenctChar = inputString.charAt(index);
			if (!Character.isLetterOrDigit(currenctChar)) {
				inputString = inputString.replace(String.valueOf(currenctChar), "");
				int newL = inputString.length();
				if (OriginalL - newL == 1) {
					nonRepeatFirstSpecial = currenctChar;
					break;
				}
				inputString = inputString.trim();
				OriginalL = inputString.length();
			}
		}
		return nonRepeatFirstSpecial;
	}

	// Program 5 : Find the freq of each character from a given String.
	void freqEachChars(String inputString) {
		int OLen = inputString.length();
		while (OLen > 0) {
			char currentChar = inputString.charAt(0);
			inputString = inputString.replace(String.valueOf(currentChar), "");
			int nLen = inputString.length();
			System.out.println(currentChar + " -> " + (OLen - nLen));
			inputString = inputString.trim();
			OLen = inputString.length();
		}
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();

		// Program 1
		String word1 = "Tejas";
		String word2 = "TejAs";
		System.out.println("Word1 = " + word1 + ", Word2 = " + word2);
		System.out.println("Above words are equal: " + assignment32.compareStrings(word1, word2));
		System.out.println();

		// Program 2
		String stringInput = "You are from technocredits dec2021 batch";
		System.out.println("Input String = " + stringInput);
		System.out.println("String with no whitespaces below:-");
		System.out.println(assignment32.removeWhiteSpaces(stringInput));
		System.out.println();

		// Program 3
		String inputStr = "in1D55iA9";
		System.out.println("Input String = " + inputStr);
		System.out.println("String in format- Lower Case + Digits + Upper Case :-");
		System.out.println(assignment32.stringInLowerDigitUpper(inputStr));
		System.out.println();

		// Program 4
		String inputStrWithSpecials = "te-ch*no_cr-edi*ts";
		System.out.println("Input String = " + inputStrWithSpecials);
		System.out.println("First non-repeating special character in above string: "+ assignment32.nonRepeatingSepecialChar(inputStrWithSpecials));
		System.out.println();

		// Program 5
		String stringForFreq = "abbcdccf";
		System.out.println("Input String = " + stringForFreq);
		System.out.println("Frequecies for each characters:- ");
		assignment32.freqEachChars(stringForFreq);
	}
}