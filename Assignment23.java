/*Assignment - 23 : 13th May'2022
WAP to find second max from user defined array.
input : 10, 20, 11, 99, 54,87, 22
output : 87*/

import java.util.Scanner;

public class Assignment23 {

	int maxNum(int[] intArray) {
		int maxNum = intArray[0];
		for (int index = 0; index < intArray.length; index++) {
			if (intArray[index] > maxNum) {
				maxNum = intArray[index];
			}
		}
		return maxNum;
	}

	// WAP to find second max from user defined array.
	int secondMaxNumber(int[] arrayInt) {
		int secondMax = arrayInt[0];
		for (int index = 0; index < arrayInt.length; index++) {
			if (arrayInt[index] > secondMax && arrayInt[index] < maxNum(arrayInt))
				secondMax = arrayInt[index];
		}
		return secondMax;
	}

	int[] stringArrayToIntArray(String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int index = 0; index < stringArray.length; index++) {
			intArray[index] = Integer.parseInt(stringArray[index]);
		}
		return intArray;
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();

		// Using Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers:-");
		String inputAsString = scanner.nextLine();
		String[] inputAsStringArray = inputAsString.split(" ");
		int[] integerArray = assignment23.stringArrayToIntArray(inputAsStringArray);
		System.out.println("Second maximum number is: " + assignment23.secondMaxNumber(integerArray));
		scanner.close();		
	}
}