class Assignment16 {	
	boolean flag = true;
	String charConvert(String str) {
		char ch = ' ';
		String result = "";
		flag = true;
		for(int index=0; index<str.length(); index++) {
			ch = str.charAt(index);
			if(Character.isDigit(str.charAt(index))) {
				result = "";
				flag = false;
			}
			else if(Character.isUpperCase(str.charAt(index))) {
				ch = Character.toLowerCase(str.charAt(index));
				result = result + ch;
			}
			else{
				ch = Character.toUpperCase(str.charAt(index));
				result = result + ch;
			}

		}
		return result;
	}

	void isDigit(String input) {
		boolean flag = false;
		for(int index=0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				flag = true;
		}
		if(flag == true)
			System.out.println(input + " --> Contains Digit");
	}

	void convertArray(String[] arr) {
		for(int index=0; index<arr.length; index++) {
			String output = arr[index];
			String result = charConvert(output);
			if(flag == true)
			System.out.println(output + " --> " + result);
			isDigit(arr[index]);
		}
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		String[] input = {"haRsH" , "te3cHNO", "cREdits" , "kRISHn9a"};
		assignment16.convertArray(input);
	}
}