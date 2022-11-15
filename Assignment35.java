

import java.util.Arrays;

public class Assignment35 {

	// Program 1 : Find triplet in a given array.
	void tripletInArray(int[] arrayInt) {
		for (int index = 0; index < arrayInt.length - 1; index++) {
			int num = arrayInt[index];
			if (arrayInt[index + 1] == num + 1 && arrayInt[index + 2] == num + 2) {
				System.out.println(num + ", " + arrayInt[index + 1] + ", " + arrayInt[index + 2]);
			}
		}
	}

	// Program 2 : Find frequency of each number in a given array.
	void freqEachNumInArray(int[] numArray) {
		for (int outerIndex = 0; outerIndex < numArray.length; outerIndex++) {
			int num = numArray[outerIndex];
			int count = 0;
			if (num != -1) {
				for (int innerIndex = 0; innerIndex < numArray.length; innerIndex++) {
					if (num == numArray[innerIndex]) {
						count++;
						numArray[innerIndex] = -1;
					}
				}
				System.out.println(num + " -> " + count);
			}
		}
	}

	// Program 3 : Find frequency of each word in a given array.
	void freqEachWordInArray(String[] wordArray) {
		for (int outerIndex = 0; outerIndex < wordArray.length; outerIndex++) {
			String word = wordArray[outerIndex];
			int count = 0;
			if (!word.equals(" ")) {
				for (int innerIndex = 0; innerIndex < wordArray.length; innerIndex++) {
					if (word.equals(wordArray[innerIndex])) {
						count++;
						wordArray[innerIndex] = " ";
					}
				}
				System.out.println(word + " -> " + count);
			}
		}
	}

	// Program 4 : WAP to print missing numbers from a given range.
	void missingNumbersInRange(int[] numArray, int startR, int endR) {
		while (startR < endR) {
			boolean isMissing = true;
			for (int num : numArray) {
				if (startR == num) {
					isMissing = false;
					break;
				}
			}
			if (isMissing)
				System.out.println(startR);
			startR++;
		}
	}

	// Program 5 : Print intersection of two arrays.
	void intersectionOf2Arrays(int[] numArray1, int[] numArray2) {
		for (int numIn1 : numArray1) {
			for (int numIn2 : numArray2) {
				if (numIn1 == numIn2) {
					System.out.println(numIn1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();

		// Program 1
		int[] inputArray = { 20, 21, 22, 29, 36, 37, 38, 42, 47 };
		System.out.println("Input Array: " + Arrays.toString(inputArray));
		System.out.println("Triplets from above array:-");
		assignment35.tripletInArray(inputArray);
		System.out.println();

		// Program 2
		int[] numberArray = { 10, 13, 10, 33, 3, 88, 3, 3, 3, 10, 10 };
		System.out.println("Number Array: " + Arrays.toString(numberArray));
		System.out.println("Frequency of each number in above array:-");
		assignment35.freqEachNumInArray(numberArray);
		System.out.println();

		// Program 3
		String[] wordArray = { "Hi", "Techno", "APR2022", "Techno", "Techno", "Hi" };
		System.out.println("Number Array: " + Arrays.toString(wordArray));
		System.out.println("Frequency of each number in above array:-");
		assignment35.freqEachWordInArray(wordArray);
		System.out.println();

		// Program 4
		int[] numArray = { 10, 11, 16, 17, 20 };
		int startRange = 10, endRange = 20;
		System.out.println("Number Array: " + Arrays.toString(numArray));
		System.out.println("Missing numbers in above array between " + startRange + " and " + endRange + ":-");
		assignment35.missingNumbersInRange(numArray, startRange, endRange);
		System.out.println();

		// Program 5
		int[] numberArray1 = { 10, 14, 25, 17, 88, 23 }, numberArray2 = { 13, 88, 19, 25, 44 };
		System.out.println("Intersection of " + Arrays.toString(numberArray1) + " and " + Arrays.toString(numberArray2) + ":-");
		assignment35.intersectionOf2Arrays(numberArray1, numberArray2);
	}
}