

import java.util.Arrays;

public class Assignment25_ConvertCaseUsingAscii {

	int asciiOfChar(char inputChar) {
		int charAscii = inputChar;
		return charAscii;
	}

	char charOfAscii(int ascii) {
		char charOfAscii = (char) ascii;
		return charOfAscii;
	}

	char convertCase(int asciiCharInput) {
		int asciiOfChar = asciiCharInput;
		char convertCaseOfChar = charOfAscii(asciiCharInput);
		if (asciiCharInput >= 65 && asciiCharInput <= 90) {
			asciiOfChar += 32;
			convertCaseOfChar = charOfAscii(asciiOfChar);
		} else if (asciiCharInput >= 97 && asciiCharInput <= 122) {
			asciiOfChar -= 32;
			convertCaseOfChar = charOfAscii(asciiOfChar);
		} else if (asciiCharInput >= 48 && asciiCharInput <= 57) {
			convertCaseOfChar = charOfAscii(asciiCharInput);
		}
		return convertCaseOfChar;
	}

	String caseConvertedSingleString(String inputString) {
		String convertedString = "";
		char[] charArrayOfString = inputString.toCharArray();
		for (char charOfString : charArrayOfString) {
			convertedString += String.valueOf(convertCase(charOfString));
		}
		return convertedString;
	}

	String[] elementCaseConvertedArray(String[] arrayString) {
		for (int index = 0; index < arrayString.length; index++) {
			arrayString[index] = caseConvertedSingleString(arrayString[index]);
		}
		return arrayString;
	}

	public static void main(String[] args) {
		Assignment25_ConvertCaseUsingAscii assignment25_ConvertCaseUsingAscii = new Assignment25_ConvertCaseUsingAscii();

		String[] array = { "AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh" };
		System.out.println("Input String Array: " + Arrays.toString(array));
		System.out.println("Output String Array: "+ Arrays.toString(assignment25_ConvertCaseUsingAscii.elementCaseConvertedArray(array)));
	}
}