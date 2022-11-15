/*Assignment - 31 : 31st May'2022

Program 1 : Return sum of all the numbers in given string.

String str = "te1ch12nocr11edi3ts15";
output : 42 
Hint : 1+12+11+3+15
  
Program 2 : Shift all the zero's at the end.
int[] arr = {1,3,0,2,0,0,-9,4,3};
output : {1,3,2,-9,4,3,0,0,0};

Program 3 : Spilt the word if it is not inside double quotes.
String input = "The earlier you "start the better" it is "for you" so start early"

output : 

The
earlier
you
"start the better"
it
is
"for you"
so 
start 
early*/


import java.util.Arrays;

public class Assignment31 {

	// Program 1 : Return sum of all the numbers in given string.
	int sumOfNumsInString(String inputString) {
		int sum = 0;
		String tempNum = "";
		for (int index = 0; index < inputString.length(); index++) {
			if (Character.isDigit(inputString.charAt(index))) {
				tempNum += inputString.charAt(index);
			} else {
				if (tempNum.length() > 0) {
					sum += Integer.parseInt(tempNum);
					tempNum = "";
				}
			}
		}
		if (tempNum.length() > 0) {
			sum += Integer.parseInt(tempNum);
			tempNum = "";
		}
		return sum;
	}

	// Program 2 : Shift all the zero's at the end.
	int[] zeroAtEnd(int[] intArr, int optdInt) {
		int[] newIntArr = new int[intArr.length];
		int index = 0;
		for (int currentInt : intArr) {
			if (currentInt != optdInt) {
				newIntArr[index++] = currentInt;
			}
		}
		while (index <= newIntArr.length - 1) {
			newIntArr[index++] = optdInt;
		}
		return newIntArr;
	}

	// Program 3 : Spilt the word if it is not inside double quotes.
	void conditionalStringSplit(String inputString) {
		String[] inputStringArray = inputString.split(" ");
		String newString = "";
		boolean flag = false;
		for (String currentString : inputStringArray) {
			if (currentString.startsWith("\"") || flag == true) {
				if (currentString.endsWith("\"")) {
					newString += currentString;
					flag = false;
					System.out.println(newString);
					newString = "";
				} else {
					newString += currentString + " ";
					flag = true;
				}
			} else {
				System.out.println(currentString);
			}
		}
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();

		// Program 1
		String stringInput = "te1ch12nocr11edi3ts15";
		System.out.println("Input String = " + stringInput);
		System.out.println("Sum of all the numbers present in string: "+assignment31.sumOfNumsInString(stringInput));
		System.out.println();

		// Program 2
		int[] inputArr = { 1, 3, 0, 2, 0, 0, -9, 4, 3 };
		int desiredInt = 0;
		System.out.println(Arrays.toString(inputArr));
		System.out.println("All " + desiredInt + "s shifted at the end: "+ Arrays.toString(assignment31.zeroAtEnd(inputArr, desiredInt)));
		System.out.println();
		int[] inputArr2 = { 1, 3, -1, 2, -1, -1, -9, 4, 3 };
		int desiredInt2 = -1;
		System.out.println(Arrays.toString(inputArr2));
		System.out.println("All " + desiredInt2 + "s shifted at the end: "+ Arrays.toString(assignment31.zeroAtEnd(inputArr2, desiredInt2)));
		System.out.println();

		// Program 3
		String iString = "The earlier you \"start the better\" it is \"for you\" so start early";
		System.out.println("Input String = " + iString);
		System.out.println("String splited as expected: ");
		assignment31.conditionalStringSplit(iString);
	}
}
