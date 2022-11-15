import java.util.Scanner;

public class Assignment27 {

	// Program 1: Compare two strings without using equals/equalsIgnoreCase method
	boolean compareStrings(String stringInput1, String stringInput2) {
		boolean isSameString = true;
		if (stringInput1.length() == stringInput2.length()) {
			for (int index1 = 0, index2 = 0; index1 < stringInput1.length(); index1++, index2++) {
				if (stringInput1.charAt(index1) != stringInput2.charAt(index2)) {
					isSameString = false;
					break;
				}
			}
		} else {
			isSameString = false;
		}
		return isSameString;
	}

	// Program 2 : Remove all white space without using replace method.
	// Method-1
	String removeWhiteSpacesInString(String stringInput) {
		String updatedString = "";
		for (int index = 0; index < stringInput.length(); index++) {
			if (Character.isLetterOrDigit(stringInput.charAt(index)) == true) {
				updatedString += stringInput.charAt(index);
			}
		}
		return updatedString;
	}

	// Program 2 : Remove all white space without using replace method.
	// Method-2
	String removeWhiteSpaces(String stringInput) {
		String updatedString = "";
		for (int index = 0; index < stringInput.length(); index++) {
			if (stringInput.charAt(index) == ' ') {
				// Below one can be used as well
				// if (Character.isWhitespace(stringInput.charAt(index)) == true) {
				continue;
			} else {
				updatedString += stringInput.charAt(index);
			}
		}
		return updatedString;
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		Scanner scanner = new Scanner(System.in);

		// Requirement1
		System.out.print("Enter compare strings iteration(s): ");
		int itereations = scanner.nextInt();
		int index = 0;
		while (index < itereations) {
			System.out.print("Enter first string: ");
			String inputString1 = scanner.next();
			System.out.print("Enter second string: ");
			String inputString2 = scanner.next();
			System.out.print("Input strings are same: ");
			System.out.println(assignment27.compareStrings(inputString1, inputString2));
			System.out.println();
			index++;
		}

		// Requirement2
		System.out.println("Enter String below:-");
		scanner.nextLine();
		String inputString = scanner.nextLine();
		System.out.println("Input string without any white spaces:- ");
		// System.out.println(assignment27.removeWhiteSpacesInString(inputString));
		System.out.println(assignment27.removeWhiteSpaces(inputString));
		scanner.close();
	}
}