class Assignment13ReverseString {

	String reverseString(String input) {
		for (int startIndex = 0, endIndex = input.length() - 1; startIndex < endIndex; startIndex++, endIndex--) {
			char currentStartCharacter = input.charAt(endIndex);
			char currentEndCharacter = input.charAt(startIndex);
			input = input.substring(0, startIndex) + currentStartCharacter + input.substring(startIndex + 1, endIndex)
					+ currentEndCharacter + input.substring(endIndex + 1);
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment13ReverseString assignment13ReverseString = new Assignment13ReverseString();

		String inputString = "Tejas";
		System.out.println("Input String: " + inputString);
		System.out.println("Reversed string: " + assignment13ReverseString.reverseString(inputString));
		System.out.println("******************************");

		String inputString2 = "Gorde";
		System.out.println("Input String: " + inputString2);
		System.out.println("Reversed string: " + assignment13ReverseString.reverseString(inputString2));
	}
}