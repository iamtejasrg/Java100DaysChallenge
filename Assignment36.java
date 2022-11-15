/*Assignment - 36 : 3th Jun'2022
Program 1 : Remove all occurance of Gaurav except last occurance.
input : [Gaurav, Maulik, Gaurav, Hi, Gaurav, Prateek]
output : [Maulik, Hi, Gaurav, Prateek]
Program 2 : Keep first gaurav and remove remaining.
input : [Gaurav, Maulik, Gaurav, Hi, Gaurav, Prateek]
output : [Gaurav, Maulik, Hi, Prateek]
Hint : indexOfIndex(), lastIndexOf(), remove(int index)*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment36 {

	// Program 1 : Remove all occurance of Gaurav except last occurance.
	List<String> remoAllNotLast(String[] nameInputs, String remoName) {
		List<String> nameList = Arrays.asList(nameInputs);
		List<String> nameArrayList = new ArrayList<String>(nameList);
		while (nameArrayList.indexOf(remoName) != nameArrayList.lastIndexOf(remoName)) {
			nameArrayList.remove(remoName);
		}
		return nameArrayList;
	}

	// Program 2 : Keep first gaurav and remove remaining.
	List<String> remoAllNotFirst(String[] inputNames, String nameRemo) {
		List<String> nameList = Arrays.asList(inputNames);
		List<String> nameArrayList = new ArrayList<String>(nameList);
		while (nameArrayList.indexOf(nameRemo) != nameArrayList.lastIndexOf(nameRemo)) {
			nameArrayList.remove(nameArrayList.lastIndexOf(nameRemo));
		}
		return nameArrayList;
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();

		// Program 1
		String[] names = { "Gaurav", "Maulik", "Gaurav", "Hi", "Gaurav", "Prateek" };
		String removeName = "Gaurav";
		System.out.println("Input Array: " + Arrays.toString(names));
		System.out.print("Array updated after removing all occurances of " + removeName + " except one/last:- ");
		System.out.println(assignment36.remoAllNotLast(names, removeName));
		System.out.println();

		// Program 2
		String[] listOfNames = { "Gaurav", "Maulik", "Gaurav", "Hi", "Gaurav", "Prateek" };
		String nameRemove = "Gaurav";
		System.out.println("Input Array: " + Arrays.toString(names));
		System.out.print("Array updated after removing all occurances of " + removeName + " except first:- ");
		System.out.println(assignment36.remoAllNotFirst(listOfNames, nameRemove));
	}
}