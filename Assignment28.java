import java.util.Arrays;

public class Assignment28 {

	// Program 1 : Find frequency of each number in a given array.
	void frequencyOfNumbers(int[] arrayInt) {
		for (int outerIndex = 0; outerIndex < arrayInt.length; outerIndex++) {
			int count = 1;
			for (int innerIndex = outerIndex + 1; innerIndex < arrayInt.length; innerIndex++) {
				if (arrayInt[outerIndex] == arrayInt[innerIndex]) {
					count++;
					arrayInt[innerIndex] = -1;
				}
			}
			if (arrayInt[outerIndex] != -1)
				System.out.println(arrayInt[outerIndex] + " -> " + count);
		}
	}

	// Program 2 : Find frequency of each word in a given array.
	void frequencyOfWord(String[] arrayString) {
		for (int outerIndex = 0; outerIndex < arrayString.length; outerIndex++) {
			int count = 1;
			for (int innerIndex = outerIndex + 1; innerIndex < arrayString.length; innerIndex++) {
				if (arrayString[outerIndex].equals(arrayString[innerIndex])) {
					count++;
					arrayString[innerIndex] = " ";
				}
			}
			if (arrayString[outerIndex] != " ")
				System.out.println(arrayString[outerIndex] + " -> " + count);
		}
	}

	// Program 3 : WAP to print missing number from given range.
	void missingNumbers(int[] arrayInt, int startRange, int endRange) {
		int count = 0;
		for (int outerIndex = startRange; outerIndex <= endRange; outerIndex++) {
			boolean isMissing = true;
			for (int innerIndex = 0; innerIndex < arrayInt.length; innerIndex++) {
				if (outerIndex == arrayInt[innerIndex]) {
					isMissing = false;
					break;
				}
			}
			if (isMissing) {
				count++;
				if (count > 1) {
					System.out.print(", ");
				}
				System.out.print(outerIndex);
			}
		}
	}

	// Program 4 : Print intersection of two arrays.
	void intersectionInArrays(int[] arrayInt1, int[] arrayInt2) {

		for (int outerIndex = 0; outerIndex < arrayInt1.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex < arrayInt2.length; innerIndex++) {
				if (arrayInt1[outerIndex] == arrayInt2[innerIndex]) {
					int intersections = arrayInt1[outerIndex];
					System.out.println(intersections);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();

		// Requirement1
		int[] intergerArray = { 10, 13, 10, 33, 3, 88, 3, 3, 3, 10, 10 };
		System.out.println("Frequency of numbers in array - " + Arrays.toString(intergerArray));
		assignment28.frequencyOfNumbers(intergerArray);
		System.out.println("--------------------------------------");

		// Requirement2
		String[] StringArray = { "Hi", "Techno", "APR2022", "Techno", "Techno", "Hi" };
		System.out.println("Frequency of words in array - " + Arrays.toString(StringArray));
		assignment28.frequencyOfWord(StringArray);
		System.out.println("--------------------------------------");

		// Requirement3
		int[] intArray = { 10, 11, 16, 17, 20 };
		int rangeStartsFrom = 10;
		int rangeEndsAt = 20;
		System.out.println("Missing numbers in " + Arrays.toString(intArray) + " between " + rangeStartsFrom + " and "
				+ rangeEndsAt + " are:-");
		assignment28.missingNumbers(intArray, rangeStartsFrom, rangeEndsAt);
		System.out.println("\n" + "--------------------------------------");

		// Requirement4
		int[] intArray1 = { 10, 14, 25, 17, 88, 23 };
		int[] intArray2 = { 13, 88, 19, 25, 44 };
		System.out.println(
				"Intersection of " + Arrays.toString(intArray1) + " and " + Arrays.toString(intArray2) + " :-");
		assignment28.intersectionInArrays(intArray1, intArray2);
	}
}