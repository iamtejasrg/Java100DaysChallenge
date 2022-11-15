/*Assignment - 37 : 4th Jun'2022
Program 1: Return unique entries from given array, without using collections framework.
input : {"Shaila", "Madhuri", "Prasad", "Sonali", "Prasad", "Shaila", "Shaila"};
output : {Shaila, Madhuri, Prasad, Sonali}
Program 2: Return unique entries from given array, using collections framework.
input : {"Shaila", "Madhuri", "Prasad", "Sonali", "Prasad", "Shaila", "Shaila"};
output : [Shaila, Madhuri, Prasad, Sonali]
Program 3 : get first and last element of LinkedHashSet.
input : {"Shaila", "Madhuri", "Prasad", "Sonali", "Prasad", "Techno"};
output : First Element -> Shaila
         Last Elemenet -> Techno
		 
Program 4 : Return ArrayList having all Missing numbers.
input : {1,2,4,8,9,10};
output : [3, 5, 6, 7] 		 
ArrayList<Integer> getMissingNumbers(Integer[] arr){
	
}
Program 5: Find duplicate numbers from array, using set. 
input : {10,11,10,88,65,65,33,44};
output : [10, 65]
Hint : get advantage of add method return type.
Program 6: Find duplicate numbers from array, using list. 
input : {10,11,10,88,65,65,33,44};
output : [10, 65]
Hint : use contains method of ArrayList.
Program 7 : Return union of two list having each element only once.
input1 : ["Maulik", "Krishna", "Aashvi", "Maulik"]
input2 : ["Maulik", "Techno", "Credits", "Aashvi", "Maulik"]
output : ["Maulik", "Krishna", "Aashvi", "Techno", "Credits"]
NOTE : Assignment should be completed by 5th Jun EOD.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment37 {

	// Program 1: Return unique entries from given array, without using collections framework.
	String[] findUniqueEntries(String[] entriesArray) {
		String[] resultentArray = new String[entriesArray.length];
		int count = 0;
		for (int indexO = 0; indexO < entriesArray.length; indexO++) {
			boolean isFirstEntry = true;
			for (int indexI = 0; indexI < indexO; indexI++) {
				if (entriesArray[indexI].equals(entriesArray[indexO])) {
					isFirstEntry = false;
				}
			}
			if (isFirstEntry) {
				resultentArray[count++] = entriesArray[indexO];
			}
		}
		return Arrays.copyOf(resultentArray, count);
	}

	// Program 2: Return unique entries from given array, using collections framework.
	LinkedHashSet<String> uniqueEntries(String[] words) {
		LinkedHashSet<String> uniqueWords = new LinkedHashSet<String>(Arrays.asList(words));
		return uniqueWords;
	}

	// Program 3 : get first and last element of LinkedHashSet.
	void firstAndLastElementInSet(String[] nameArray) {
		LinkedHashSet<String> nameSet = new LinkedHashSet<String>(Arrays.asList(nameArray));
		ArrayList<String> nameArrayList = new ArrayList<String>(nameSet);
		System.out.println("Only unique names: " + nameSet);
		System.out.println("First Element: " + nameArrayList.get(0));
		System.out.println("Last Elemnt: " + nameArrayList.get(nameArrayList.size() - 1));
	}

	LinkedHashSet<Integer> NumArrayOfRange(int startR, int endR) {
		LinkedHashSet<Integer> intArrayOfRange = new LinkedHashSet<Integer>();
		for (int index = startR; index <= endR; index++) {
			intArrayOfRange.add(index);
		}
		return intArrayOfRange;
	}

	// Program 4 : Return ArrayList having all Missing numbers.
	ArrayList<Integer> missingNumbers(Integer[] numArray, int startNum, int endNum) {
		ArrayList<Integer> inputNumersArray = new ArrayList<Integer>(Arrays.asList(numArray));
		ArrayList<Integer> getMissingNumbersArray = new ArrayList<Integer>(NumArrayOfRange(startNum, endNum));
		getMissingNumbersArray.removeAll(inputNumersArray);
		return getMissingNumbersArray;
	}

	// Program 5: Find duplicate numbers from array, using set.
	LinkedHashSet<Integer> findDuplicatesUsingSet(Integer[] numArray) {
		LinkedHashSet<Integer> duplicatesOnly = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> checkDuplicates = new LinkedHashSet<Integer>();
		for (int num : numArray) {
			if (!checkDuplicates.add(num)) {
				duplicatesOnly.add(num);
			}
		}
		return duplicatesOnly;
	}

	// Program 6: Find duplicate numbers from array, using list.
	ArrayList<Integer> findDuplicatesUsingList(Integer[] numArray) {
		ArrayList<Integer> resultentList = new ArrayList<Integer>();
		ArrayList<Integer> checkDuplicatesList = new ArrayList<Integer>();
		for (Integer num : numArray) {
			if (!checkDuplicatesList.contains(num)) {
				checkDuplicatesList.add(num);
			} else {
				resultentList.add(num);
			}
		}
		return resultentList;
	}

	// Program 7 : Return union of two list having each element only once.
	LinkedHashSet<String> unionOf2ListsOfUniques(String[] strArray1, String[] strArray2) {
		ArrayList<String> strArrayList1 = new ArrayList<String>(Arrays.asList(strArray1));
		ArrayList<String> strArrayList2 = new ArrayList<String>(Arrays.asList(strArray2));
		strArrayList1.addAll(strArrayList2);
		LinkedHashSet<String> unionOfUniques = new LinkedHashSet<String>(strArrayList1);
		return unionOfUniques;
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();

		// Program 1
		String[] nameStringArray = { "Shaila", "Madhuri", "Prasad", "Sonali", "Prasad", "Shaila", "Shaila" };
		System.out.println("All Entries: " + Arrays.toString(nameStringArray));
		System.out.println("Unique Entries: "
				+ Arrays.toString(assignment37.findUniqueEntries(nameStringArray)));
		System.out.println();

		// Program 2
		String[] nameStrings = { "Shaila", "Madhuri", "Prasad", "Sonali", "Prasad", "Shaila", "Shaila" };
		System.out.println("All Entries: " + Arrays.toString(nameStrings));
		System.out.println("Unique Entries: " + assignment37.uniqueEntries(nameStrings));
		System.out.println();

		// Program 3
		String[] names = { "Shaila", "Madhuri", "Prasad", "Sonali", "Prasad", "Techno" };
		System.out.println("Name Array: " + Arrays.toString(names));
		assignment37.firstAndLastElementInSet(names);
		System.out.println();

		// Program 4
		Integer[] numberArray = { 1, 2, 4, 8, 9, 10 };
		int startRange = 1, endRange = 10;
		System.out.println("Missing numbers between " + startRange + " and " + endRange + " in "
				+ Arrays.toString(numberArray) + " :-");
		System.out.println(assignment37.missingNumbers(numberArray, startRange, endRange));
		System.out.println();

		// Program 5
		Integer[] numberInputs = { 10, 11, 10, 88, 65, 65, 33, 44 };
		System.out.println("Integer Array: " + Arrays.toString(numberInputs));
		System.out.println("Duplicate numbers in above array: "
				+ assignment37.findDuplicatesUsingSet(numberInputs));
		System.out.println();

		// Program 6
		Integer[] numberInputs2 = { 10, 11, 10, 88, 65, 65, 33, 44 };
		System.out.println("Integer Array: " + Arrays.toString(numberInputs2));
		System.out.println("Duplicate numbers in above array: "
				+ assignment37.findDuplicatesUsingList(numberInputs2));
		System.out.println();

		// Program 7
		String[] nameArray1 = { "Maulik", "Krishna", "Aashvi", "Maulik" };
		String[] nameArray2 = { "Maulik", "Techno", "Credits", "Aashvi", "Maulik" };
		System.out.println("Union of " + Arrays.toString(nameArray1) + " and " + Arrays.toString(nameArray2)
				+ " having each element only once:-");
		System.out.println(assignment37.unionOf2ListsOfUniques(nameArray1, nameArray2));
	}
}