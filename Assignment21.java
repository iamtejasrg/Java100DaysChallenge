import java.util.Arrays;

public class Assignment21 {

	// Program 1 : Find max value at differed index.
	void maxValueAtDifferedIndex(int[] intArray1, int[] intArray2) {
		for (int index = 0; index < intArray1.length; index++) {
			if (intArray1[index] != intArray2[index]) {
				System.out.print("Values are not matching at index -> " + index);
				int maxValue = intArray1[index] > intArray2[index] ? intArray1[index] : intArray2[index];
				System.out.println(", From (" + intArray1[index] + "," + intArray2[index] + ") max value is: " + maxValue);
			}
		}
	}

	// Program 2 : Find all differ index from given arrays.
	void allDifferInStringArray(String[] stringArray1, String[] stringArray2) {
		for (int index = 0; index < stringArray1.length; index++) {
			if (stringArray1[index] != stringArray2[index]) {
				System.out.println("Values are not matching at index -> " + index + ", " + Arrays.toString(stringArray1)
						+ " value is: " + stringArray1[index] + ", " + Arrays.toString(stringArray2) + " value is: "
						+ stringArray2[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();

		// Requirement 1
		int[] inputIntArray1 = { 10, 2, 9, 14, 3 };
		int[] inputIntArray2 = { 10, 2, 18, 14, 3 };
		assignment21.maxValueAtDifferedIndex(inputIntArray1, inputIntArray2);
		System.out.println();

		// Requirement 2
		String[] inputStringArray1 = { "Maulik", "Harsh", "Krishna", "Technocredits" };
		String[] inputStringArray2 = { "Maulik", "Harsh", "Technocredits", "Krishna" };
		assignment21.allDifferInStringArray(inputStringArray1, inputStringArray2);
	}
}