/*Assignment 18 : 6th May'2022 [40 mins]
Program 1: Sum all the numbers in a given string.
String str = "10 20 30 40 50";
output : 150
Hint : Use spilt method
Program 2 : Get maximum number from given String.
String str = "10 20 130 40 50";
output : 130
Program 3 : Write a method to convert String array into int array.
int[] convertToIntArray(String[] str){
}*/

import java.util.Arrays;

public class Assignment18 {
	int sumOfAllNumbers(String[] numbers) {
		int sum = 0;
		for (int index = 0; index < numbers.length; index++) {
			int number = Integer.parseInt(numbers[index]);
			sum += number;
		}
		return sum;
	}

	int getMaximumNumberFromString(String[] numbers) {
		int maxnumber = 0;
		for (int index = 0; index < numbers.length; index++) {
			int number = Integer.parseInt(numbers[index]);
			if (maxnumber < number) {
				maxnumber = number;
			}
		}
		return maxnumber;
	}

	int[] convertToStringArray(String[] numbers) {
		int[] numbersArray = new int[numbers.length];
		for (int index = 0; index < numbers.length; index++) {
			numbersArray[index] = Integer.parseInt(numbers[index]);
		}
		return numbersArray;

	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		String str1 = "10 20 30 40 50";
		String[] input1 = str1.split(" ");		
		int sum=assignment18.sumOfAllNumbers(input1);
		System.out.println("sum Of All Numbers is "+sum);

		String str2 = "10 20 130 40 50";
		String[] input2 = str2.split(" ");
		int maxnumber =assignment18.getMaximumNumberFromString(input2);
		System.out.println("Maximum Number from the String Array is : "+maxnumber);

		int[] convertedIntArray = assignment18.convertToStringArray(input2);
		System.out.println("String Array Converted to Int Array : "+Arrays.toString(convertedIntArray));


	}

}