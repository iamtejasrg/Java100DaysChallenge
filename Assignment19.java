public class Assignment19{

	void findFrquencyOfChar(String input) {
            System.out.println("Input string is => "+input+""+"\nOutput: ");
		    while(input.length()>0) {
			String ch=String.valueOf(input.charAt(0));
			int originalLength= input.length();
			input =input.replace(ch,"");
			int newLength=input.length();
			System.out.println(ch +" -> "+(originalLength-newLength));
		}
	}
	void findFrequencyOfWord(String str){
		System.out.println("Input string is =>  "+str+""+"\nOutput: ");
		while (str.length() > 0) {

			int originalLength = str.length();
			String[] arr = str.split(" ");
			str = str.replace(arr[0], " ");
			str = str.trim();
			int newLength = str.length();

			System.out.println(arr[0] + " --> " + (originalLength - newLength) / arr[0].length());
		}
	}	
	public static void main(String[] args) {
		Assignment19 assignment19=new Assignment19();
		String str="Technocredits";
		System.out.println("*** frequency of each character in a given word  ***");
		assignment19.findFrquencyOfChar(str);
		String input = "Techno aashvi admin aashvi Techno credits EliteQA EliteQA credits EliteQA";
		System.out.println("*** frequency of each word in a given string ***");
		assignment19.findFrequencyOfWord(input);

	}
} 