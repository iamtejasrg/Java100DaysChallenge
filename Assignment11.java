/*Assignment - 11
Program 1 : WAP to get expected output.
String input = "TeCHn#oc4re1di-tS";
output : 41TCHSenocredit
Hint : Digit+UC+LC
Program 2 : WAP to return reverse string.
input = "technoCRedits";
output = "stideRConhcet";
Program 3: WAP to reverse a string and covert character case.
input = "te3CHNOCRedit-s";
output = "S-TIDErconhc3ET";
Program 4 : Print first index and last index of Capital letter.
input = "teChnOcreDits";
output : First Uppercase found at index 2, last uppercase found at index 9.
Program 5 : return total space character in a given string.
input  = "Hi He llo How are you";
output = 5;*/

public class Assignment11 {

	String requirement1(String input) {
		input.trim();
		String upperCaseChars = "";
		String lowerCaseChars = "";
		String digitChars = "";
		String outputString = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLetter(input.charAt(index)) == true) {
				if (Character.isUpperCase(input.charAt(index)) == true)
					upperCaseChars += input.charAt(index);
				else
					lowerCaseChars += input.charAt(index);
			} else if (Character.isDigit(input.charAt(index)) == true)
				digitChars += input.charAt(index);
		}
		outputString = digitChars + upperCaseChars + lowerCaseChars;
		return outputString;

	}

	String requirement2ReverseString(String input) {
		input.trim();
		String reverseString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			reverseString += input.charAt(index);
		}
		return reverseString;
	}

	String requirement3ReverseStringConvertCase(String input) {
		input.trim();
		String outputString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			if (Character.isLetter(input.charAt(index)) == true) {
				if (Character.isUpperCase(input.charAt(index)) == true)
					outputString += Character.toLowerCase(input.charAt(index));
				else if (Character.isLowerCase(input.charAt(index)) == true)
					outputString += Character.toUpperCase(input.charAt(index));
			} else
				outputString += input.charAt(index);
		}
		return outputString;
	}

	void requirement4(String input) {
		input.trim();
		int upperCaseAt = -1;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index)) == true)
				if (upperCaseAt == -1) {
					upperCaseAt = index;
					System.out.println("First upper case found at index " + upperCaseAt);
				} else
					upperCaseAt = index;
		}
		System.out.println("Last upper case found at index " + upperCaseAt);
	}

	int requirement5TotalSpaces(String input) {
		input.trim();
		int lengthOfCompleteString = input.length();

		String inputStringWithoutSpaces = input.replace(" ", "");
		int lengthOfStringWithoutSpaces = inputStringWithoutSpaces.length();

		int totalSpacesInStringInput = lengthOfCompleteString - lengthOfStringWithoutSpaces;

		return totalSpacesInStringInput;
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();

		// Requirement 1
		String inputStringRequirement1 = "TeCHn#oc4re1di-tS";
		System.out.println("Input string = "+inputStringRequirement1);
		System.out.println("All digits + All UC characters + All LC characters, as Output String = "+assignment11.requirement1(inputStringRequirement1));
		System.out.println("-------------------------------------------------------------");

		// Requirement 2
		String inputStringRequirement2 = "technoCRedits";
		System.out.println("Input string = "+inputStringRequirement2);
		System.out.println("Reversed string = "+assignment11.requirement2ReverseString(inputStringRequirement2));
		System.out.println("-------------------------------------------------------------");

		// Requirement 3
		String inputStringRequirement3 = "te3CHNOCRedit-s";
		System.out.println("Input string = "+inputStringRequirement3);
		System.out.println("String reversed and character case converted = "+assignment11.requirement3ReverseStringConvertCase(inputStringRequirement3));
		System.out.println("-------------------------------------------------------------");

		// Requirement 4
		String inputStringRequirement4 = "teChnOcreDits";
		System.out.println("Input string = "+inputStringRequirement4);
		assignment11.requirement4(inputStringRequirement4);
		System.out.println("-------------------------------------------------------------");

		// Requirement 5
		String inputStringRequirement5 = "Hi He llo How are you";
		System.out.println("Input string = " + inputStringRequirement5);
		System.out.println("Total spaces in given string = " + assignment11.requirement5TotalSpaces(inputStringRequirement5));
		System.out.println("-------------------------------------------------------------");
	}
}