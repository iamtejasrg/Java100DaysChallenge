public class Test5 {

	void printMiddleCharacter(String input)
	{
		System.out.println("Program 1: Create a new method to print middle character of all words.");
		String[] arr = input.split(" ");
		for(int index = 0; index < arr.length; index++)
		{
			int strLength = arr[index].length();
			int midChar = 0;
			if(strLength %2 != 0)
				midChar = strLength/2;
			else
				midChar = strLength/2-1;
			System.out.println(arr[index].charAt(midChar)+" is middle character in "+arr[index]);
		}	
	}

	void printFirstDifferIndex()
	{
		System.out.println("=======================================================");
		System.out.println("Program 2: Find first differ index from given arrays.");
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		for(int index = 0; index < arr1.length && index <arr2.length; index++)
		{
			if(arr1[index] != arr2[index])
			{
				System.out.println("Values are not matching at index --> " +index);
				break;
			}
		}
	}

	void printDifferIndex()
	{
		System.out.println("=======================================================");
		System.out.println("Program 3: Find all differ index from given arrays.");
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,13};
		for(int index = 0; index < arr1.length && index < arr2.length; index++)
		{
			if(arr1[index] != arr2[index])
				System.out.println("Values are not matching at index --> " +index);
		}
	}

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		String str = "Harsh Maulik Krishna";
		test5.printMiddleCharacter(str);
		test5.printFirstDifferIndex();
		test5.printDifferIndex();
	}
}