package tejas;

import java.util.Arrays;

public class Assignment33 {

	// Program 1 : Write a method to return the first non repeating Capital character.
	char firstUpper(String inputString) {
		char firstCapChar = ' ';
		for (int index = 0; index < inputString.length(); index++) {
			int currentLength = inputString.length();
			char currentChar = inputString.charAt(index);
			if (Character.isUpperCase(currentChar)) {
				inputString = inputString.replace(String.valueOf(currentChar), "");
				int updatedLength = inputString.length();
				if (currentLength - updatedLength == 1) {
					firstCapChar = currentChar;
					break;
				}
			}
		}
		return firstCapChar;
	}

	// Program 2: Find maximum word length from a given statement.
	String maxLengthWord(String inputString) {
		String[] inputStringArray = inputString.split(" ");
		int maxLengthString = 0;
		String maxLengthWord = "";
		for (String currentString : inputStringArray) {
			if (currentString.length() > maxLengthString) {
				maxLengthString = currentString.length();
				maxLengthWord = currentString;
			}
		}
		return maxLengthWord;
	}

	// Program 3 : sum of all numbers in a given statement.
	int sumOFNums(String inputString) {
		String[] inputStringsArray = inputString.split(" ");
		int sum = 0;
		for (String currentNumString : inputStringsArray) {
			sum += Integer.parseInt(currentNumString);
		}
		return sum;
	}

	// Program 4 : How many numbers will be required from the fibonacci series which generates a sum more than 70.
	int fiboCountReq(int sum) {
		int fibo1st = 0, fibo2nd = 1;
		int fiboSum = fibo1st + fibo2nd;
		int fiboCount = 2;
		while (sum > fiboSum) {
			int fiboNext = fibo1st + fibo2nd;
			fiboSum += fiboNext;
			fiboCount++;
			fibo1st = fibo2nd;
			fibo2nd = fiboNext;
		}
		return fiboCount;
	}

	// Program 5 : Find frequency of each word.
	void freqEachWord(String inputStrings) {
		int stringOLength = inputStrings.length();
		while (stringOLength > 0) {
			String[] inputStringArray = inputStrings.split(" ");
			String currentWord = inputStringArray[0];
			inputStrings = inputStrings.replace(currentWord, "");
			int stringNewLength = inputStrings.length();
			System.out.println(currentWord + " -> " + (stringOLength - stringNewLength) / currentWord.length());
			inputStrings = inputStrings.trim();
			stringOLength = stringNewLength;
		}
	}

	// Program 6 : Verify given Strings are Anagram or not.
	boolean isAnagram(String inputString1, String inputString2) {
		boolean areStringsAnagram = false;
		inputString1 = inputString1.toLowerCase();
		inputString2 = inputString2.toLowerCase();
		char[] array1 = inputString1.toCharArray();
		char[] array2 = inputString2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if (Arrays.equals(array1, array2))
			areStringsAnagram = true;
		return areStringsAnagram;
	}

	// Program 6- Try2 : Verify given Strings are Anagram or not.
	boolean isAnagram2(String string1, String string2) {
		string1 = string1.replace(" ", "");
		string2 = string2.replace(" ", "");
		boolean areStringsAnagram = true;
		if (string1.length() == string2.length()) {
			string1 = string1.toLowerCase();
			string2 = string2.toLowerCase();
			int string1Length = string1.length();
			while (string1Length > 0) {
				char currentChar = string1.charAt(0);

				string1 = string1.replace(String.valueOf(currentChar), "");
				int string1NewLength = string1.length();
				int string1Diff = string1Length - string1NewLength;

				string2 = string2.replace(String.valueOf(currentChar), "");
				int string2NewLength = string2.length();
				int string2Diff = string1Length - string2NewLength;

				if (string1Diff != string2Diff) {
					areStringsAnagram = false;
				}
				string1Length = string1NewLength;
			}
		} else {
			areStringsAnagram = false;
		}
		return areStringsAnagram;
	}

	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();

		// Program 1
		String stringInput = "tEChNoCrEdits";
		System.out.println("Input String: " + stringInput);
		System.out.println(
				"First non-repeating Capital character in above string: " + assignment33.firstUpper(stringInput));
		System.out.println();

		// Program 2
		String stringStatement = "good morning technocredits hi hello";
		System.out.println("input statement: " + stringStatement);
		System.out.println("Max length word in above statement: " + assignment33.maxLengthWord(stringStatement));
		System.out.println();

		// Program 3
		String intStatement = "10 10 20 30";
		System.out.println("Input statement: " + intStatement);
		System.out.println("Sum of all numbers in above statement: " + assignment33.sumOFNums(intStatement));
		System.out.println();

		// Program 4
		int reqSum = 70;
		System.out.println("Fibonacci numbers count required for sum more than " + reqSum + ": "
				+ assignment33.fiboCountReq(reqSum));
		System.out.println();

		// Program 5
		String input = "Hi Hello Hi Techno Credits Hi";
		System.out.println("Input Strings: " + input);
		System.out.println("Frequency of each word:-");
		assignment33.freqEachWord(input);
		System.out.println();

		// Program 6
		String word1 = "Keep";
		String word2 = "Peek";
		System.out.println("Word1: " + word1 + ", Word2: " + word2);
		System.out.println("Above words are anangram: " + assignment33.isAnagram(word1, word2));

		// Program 6- Try2
		String word3 = "Mother In Law";
		String word4 = "Hitler Woman";
		System.out.println("Word1: " + word3 + ", Word2: " + word4);
		System.out.println("Above words are anangram: " + assignment33.isAnagram2(word3, word4));
	}
}