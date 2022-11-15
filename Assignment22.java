/*Assignment - 22 : 12th May'2022

Program 1 : Print only unique characters from user defined String.
Hint : Use scanner class.

input : aashvi
output : Unique characters from aashvi is shvi

input : technocredits
output : Unique characters from technocredits is hnordis


Program 2 : Print all the name having atleast one duplicate character. Take input from user.

Hint :

boolean isNameHavingDuplicateChar(String name){
	return true;
}
 
void processName(String[] arr){
	for(int index=0;index<arr.length;index++){
		boolean flag = isNameHavingDuplicateChar(arr[index]);
		if(flag == true)
			sop(arr[index]);
	}
}

Program 3 : return reverse string. Take input from user.
input : technocredits
output : stiderconhcet

Program 4 : From user defined input, print frequency of all characters.
input : technocredits

while(input.length()>0){
    char ch = input.charAt(0);
	int ol = input.length();
	input = input.replace(String.valueOf(ch),"");
	int nl = input.length();
	//if((ol-nl) > 1)
		//output += ch;
	sop(ch + "--" + (ol-nl));
}
output : t -> 2
         e -> 2
		 c -> 2
		 h -> 1
		 n -> 1
		 o -> 1
		 r -> 1
		 d -> 1
		 i -> 1
		 s -> 1*/
		 

import java.util.Scanner;

public class Assignment22 {

	// Program 1 : Print only unique characters from user defined String.
	String uniqueCharsInString(String inputString) {
		inputString = inputString.toLowerCase();
		String uniqueChars = "";
		while (inputString.length() > 0) {
			int originalLength = inputString.length();
			char character = inputString.charAt(0);
			inputString = inputString.replace(String.valueOf(character), "");
			int newLength = inputString.length();
			if (originalLength - newLength == 1)
				uniqueChars += String.valueOf(character);
		}
		return uniqueChars;
	}

	boolean isDuplicateCharPresentInString(String stringInput) {
		boolean isDuplicateCharPresent = false;
		if (stringInput.length() != uniqueCharsInString(stringInput).length()) {
			isDuplicateCharPresent = true;
		}
		return isDuplicateCharPresent;
	}

	// Program 2 : Print all the name having atleast one duplicate character. Take input from user.
	void namesHavingDuplicateCharsPresent(String[] stringArray) {
		for (int index = 0; index < stringArray.length; index++) {
			if (isDuplicateCharPresentInString(stringArray[index]) == true)
				System.out.println(stringArray[index]);
		}
	}

	// Program 3 : Return reverse string. Take input from user.
	String reverseString(String stringInput) {
		for (int startIndex = 0, endIndex = stringInput.length() - 1; startIndex < endIndex; startIndex++, endIndex--) {
			char firstCharacter = stringInput.charAt(endIndex);
			char lastCharacter = stringInput.charAt(startIndex);
			stringInput = stringInput.substring(0, startIndex) + firstCharacter
					+ stringInput.substring(startIndex + 1, endIndex) + lastCharacter
					+ stringInput.substring(endIndex + 1);
		}
		return stringInput;
	}

	// Program 4 : From user defined input, print frequency of all characters.
	void frequencyOfChars(String inputString) {
		while (inputString.length() > 0) {
			char character = inputString.charAt(0);
			int originalLength = inputString.length();
			inputString = inputString.replace(String.valueOf(character), "");
			int newLength = inputString.length();
			System.out.println(character + " - > " + (originalLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		Scanner scanner = new Scanner(System.in);

		// Requirement 1
		System.out.println("Enter a string to get unique characters: ");
		String stringInput = scanner.next();
		System.out.println("Unique characters from "+stringInput+" is: "+assignment22.uniqueCharsInString(stringInput));
		System.out.println();
		System.out.println("Enter a string to get unique characters: ");
		String stringInput2 = scanner.next();
		System.out.println("Unique characters from "+stringInput2+" is: "+assignment22.uniqueCharsInString(stringInput2));
		System.out.println();

		// Requirement 2
		System.out.println("Enter all required names and get names having atleast one duplicate charactrs: input format as name1,name2,name3,,,");
		String name = scanner.next();
		String[] nameArray = name.split(",");
		System.out.println("All name having atleast one duplicate character: ");
		assignment22.namesHavingDuplicateCharsPresent(nameArray);
		System.out.println();

		// Requirement 3
		System.out.println("Enter a string to get it reversed: ");
		String inputString = scanner.next();
		System.out.println("String reversed:- ");
		System.out.println(inputString+" -> "+assignment22.reverseString(inputString));
		System.out.println();

		// Requirement 4
		System.out.println("Enter a string to get frequency of all characters: ");
		String string = scanner.next();
		System.out.println("Frequency of all characters:- ");
		assignment22.frequencyOfChars(string);

	}
}