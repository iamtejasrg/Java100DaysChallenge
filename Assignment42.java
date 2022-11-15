/*Assignment - 42 : 11th Jun'2022
WAP to generate output in expected format.
input : {"Arti", "Zendesk", "Prachi", "Prabhat", "Meenu", "Minal", "Apurva", "Suchit", "Sanchit"}
A -> [Arti, Apurva]
Z -> [Zendesk]
P -> [Prachi, Prabhat]
M -> [Meenu, Minal]
S -> [Suchit, Sanchit]*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;

public class Assignment42 {

	void getExpectedFormate(String[] nameArray) {
		LinkedHashMap<Character, ArrayList<String>> outputFormate = new LinkedHashMap<Character, ArrayList<String>>();
		for (String name : nameArray) {
			char firstChar = name.charAt(0);
			if (outputFormate.containsKey(firstChar)) {
				ArrayList<String> tempList = outputFormate.get(firstChar);
				tempList.add(name);
				outputFormate.put(firstChar, tempList);
			} else {
				ArrayList<String> newTempList = new ArrayList<String>();
				newTempList.add(name);
				outputFormate.put(firstChar, newTempList);
			}
		}
		Set<Character> keyChars = outputFormate.keySet();
		for (char startChar : keyChars) {
			System.out.println(startChar + " -> " + outputFormate.get(startChar));
		}
	}

	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();

		String[] namesAsArray = { "Arti", "Zendesk", "Prachi", "Prabhat", "Meenu", "Minal", "Apurva", "Suchit", "Sanchit" };
		System.out.println("Input names array: " + Arrays.toString(namesAsArray));
		System.out.println("Output below in expected formate:-");
		assignment42.getExpectedFormate(namesAsArray);
	}
}