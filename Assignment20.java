public class Assignment20{

	void convertAsciiToCharacter(int ascii) {
		char ch = (char) ascii;
		System.out.println(ascii + "-->" + ch);
	}

	void convertCharacterToAscii(char ch) {
		int ascii = ch;
		System.out.println(ch + "-->" + ascii);
	}

	void printCharactersInRange(int startRange, int endRange) {
		System.out.println("Given range: " + startRange + " to " + endRange);
		System.out.println("all the characters within range " + startRange + " to :" + endRange);

		for (int index = startRange; index <= endRange; index++) {
			convertAsciiToCharacter(index);
		}
	}

	void printAscii(char startChar, char endChar) {
		System.out.println("");
		System.out.println("Given range:" + startChar + " to " + endChar);
		System.out.println("ascii for all characters between A-Z: ");
		for (char ch = startChar; ch <= endChar; ch++) {
			convertCharacterToAscii(ch);
		}
	}

	String convertCharIntoNextChar(String str) {

		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'z')
				output += 'a';
			else if (ch == 'Z')
				output += 'A';
			else if (Character.isDigit(ch) || Character.isLetter(ch))
				output += ++ch;
			else
				output += ch++;
		}
		return output;
	}


	public static void main(String[] args) {
		Assignment20 assignment20= new Assignment20();
		System.out.println("Convert Ascii to Character: ");
		int ascii = 98;
		System.out.println("Given input: " + ascii);
		assignment20.convertAsciiToCharacter(ascii);
		System.out.println("");
		
		System.out.println("Convert Character to Ascii : ");
		char ch = 'a';
		System.out.println("Given character: " + ch);
		assignment20.convertCharacterToAscii(ch);
		System.out.println("");
		
		assignment20.printCharactersInRange(91, 96);

		assignment20.printAscii('A', 'Z');
		
		System.out.println("");
		System.out.println("converting each character to its next character: ");

		String str1 = "acpz";
		String output1 = assignment20.convertCharIntoNextChar(str1);
		System.out.println("\nGiven string: " + str1 + "\noutput: " + output1);
		System.out.println("");
		
		String str2 = "AvZp";
		String output2 = assignment20.convertCharIntoNextChar(str2);
		System.out.println("\nGiven string: " + str2 + "\noutput: " + output2);
		System.out.println("");
		
		String str3 = "Av-Z$p";
		String output3 = assignment20.convertCharIntoNextChar(str3);
		System.out.println("\nGiven string: " + str3 + "\noutput: " + output3);
		System.out.println("");
	}

} 