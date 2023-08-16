/*
 * Assignment - 10  
Program 1: Write a program to find frequency of given character from given string.
input : word -> technocredits
        ch -> e
output : e -> 2
Program 2: WAP to find frequency of all characters from given string. 
input : word -> technocredits
output : t -> 2
         e -> 2 
		 c -> 2
		 h -> 1
		 n -> 1
		 o -> 1
		 r -> 1
		 d -> 1
		 i -> 1
		 s -> 1
		 
Program 3 : WAP to return count of digits in given string.
input : word -> Tec1hnoc3re9di7ts2
output : 5
Program 4 : WAP to print count of capital letter, lowercase letter & digits in given string.
input : word -> Tec1hnoC3re9di7ts2
output : Capital letter: 2
         Small letter : 11
		 digits : 5
		
Program 5 : WAP to return first Capital letter from given string.
input : word -> technoCrediTS
output : C
 */



public class Assignment10 {

	public static void main(String[] args)
	{
		Assignment10 assignment10 = new Assignment10();
		//int count = assignment10.getCharacterFrequency("technocredits", 'e');
		//System.out.println(count);
		assignment10.getCharacterFrequency("technocredits", 'e');
		assignment10.getAllCharactersFrequency("technocredits");
		assignment10.getCount("Tec1hnoc3re9di7ts2");
		assignment10.isCount("Tec1hnoC3re9di7ts2");
		assignment10.toFindFirstUpperCase("technoCrediTS");
	}
	//Method to get count for given character in string
	int getCharacterFrequency(String input, char ch)
	{
		int count =0;
		for(int index=0; index<input.length();index++)
		{
			if(input.charAt(index)==ch)
			{
				count++;
			}
		}
		System.out.println("Frequency of "+ch+" character in "+input+" string is "+count);
		return count;
	}

	//Method to get frequency of all characters in given string 
	void getAllCharactersFrequency(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			char ch =input.charAt(i);
			if(input.indexOf(ch)==i)
			{
				getCharacterFrequency(input, input.charAt(i));
			}	
		}
		System.out.println("-------------------------------------------------------------------");
	}

	//Method to get count of digit in given string
	int getCount(String input)
	{
		int count = 0;
		for(int index=0;index<input.length();index++)
		{
			if(Character.isDigit(input.charAt(index)))
			{
				count++;
			}
		}
		System.out.println("Count of digit in given string "+input+" is "+count);
		System.out.println("-------------------------------------------------------------------");
		return 0;
	}

	//Method to get count of uppercase, lowercase and digit in given string
	void isCount(String input)
	{
		int uppercaseCount=0;
		int lowerCaseCount=0;
		int digitCount = 0;
		for(int index=0;index<input.length();index++)
		{
			if(Character.isUpperCase(input.charAt(index)))
			{
				uppercaseCount++;
			}
			else if(Character.isLowerCase(input.charAt(index)))
			{
				lowerCaseCount++;
			}
			else
			{
				digitCount++;
			}
		}
		System.out.println("Uppercase count is in "+input+" string is "+uppercaseCount);
		System.out.println("Lowercase count is in "+input+" string is "+lowerCaseCount);
		System.out.println("Digit count is in "+input+" string is "+digitCount);
		System.out.println("-------------------------------------------------------------------");
	}

	void toFindFirstUpperCase(String input)
	{
		for(int index=0;index<input.length();index++)
		{
			if(Character.isUpperCase(input.charAt(index)))
			{
				System.out.println("First uppercase in "+input+" string is "+input.charAt(index));
				break;
			}

		}

	}
}
