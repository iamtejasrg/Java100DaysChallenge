/*Assignment - 38 : 5th Jun'2022
Program 1 :
Print the first non repeating character from given string [without using collections framework].
String str = "technocredits";
output : h
Program 2 :
Print the first non repeating character from given string [with using collections framework].
String str = "technocredits";
output : h
Program 3 (Optional) :
Print the first non repeating word from given string [with using collections framework].
String str = "Hi Hello Hi Techno Hello Credits Globant Super";
output : Techno
Program 4 (Optional) :
Print the first non repeating number from given array [with using collections framework].
arr : {10,33,44,22,10,99,33,44};
output : 22
Program 5 : [VIMP]
Find the frequency of each character using map, insertion order should be maintained.
Program 6 : [VIMP]
Find the frequency of each word using map, key's natural order should be maintained.
Program 7 : [VIMP]
Find the frequency of each number using map.
Program 8 : Find the number which is repeated the most using collections framework. 
arr : {10,11,13,14,10,11,11,11,14,34};
output : 11
Program 9 : Find the word which is repeated the most using collections framework. 
String str = "Hi Hello Hi Techno Hello Credits Globant Super";
output : Hi
         Hello
Program 10 (Optional) : From given string Find the most repeating character using collections framework. 
String str = "akanksha";
output : a*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Assignment38 {

	// Program 1 : Print the first non repeating character from given string [without using collections framework].
	void nonRepeatCharFirst(String wordInput) {
		int oLen = wordInput.length();
		while (oLen > 0) {
			String currentChar = String.valueOf(wordInput.charAt(0));
			wordInput = wordInput.replace(currentChar, "");
			int nLen = wordInput.length();
			if (oLen - nLen == 1) {
				System.out.println(currentChar);
				break;
			}
			oLen = nLen;
		}
	}

	// Program 2 : Print the first non repeating character from given string [with using collections framework].
	void nonRepeatCharFrmCollections(String wordInput) {
		LinkedHashMap<Character, Integer> freqEachChars = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < wordInput.length(); index++) {
			char currenctChar = wordInput.charAt(index);
			if (freqEachChars.containsKey(currenctChar)) {
				freqEachChars.put(currenctChar, freqEachChars.get(currenctChar) + 1);
			} else {
				freqEachChars.put(currenctChar, 1);
			}
		}
		Iterator<Character> keyItr = freqEachChars.keySet().iterator();
		while (keyItr.hasNext()) {
			char currentKey = keyItr.next()
			int currentValue =n freqEachChars.get(currentKey);
			if (currentValue == 1) {
				System.out.println(currentKey);
				break;
			}
		}
	}

	// Program 3 (Optional) : Print the first non repeating word from given string [with using collections framework].
	void nonRepeatWordFrmCollections(String stringInput) {
		String[] stringInputArray = stringInput.split(" ");
		LinkedHashMap<String, Integer> freqEachWord = new LinkedHashMap<String, Integer>();
		for (String word : stringInputArray) {
			if (freqEachWord.containsKey(word)) {
				freqEachWord.put(word, freqEachWord.get(word) + 1);
			} else {
				freqEachWord.put(word, 1);
			}
		}
		Iterator<String> keyItr = freqEachWord.keySet().iterator();
		while (keyItr.hasNext()) {
			String currentWord = keyItr.next();
			int currentValue = freqEachWord.get(currentWord);
			if (currentValue == 1) {
				System.out.println(currentWord);
				break;
			}
		}
	}

	// Program 4 (Optional) : Print the first non repeating number from given array [with using collections framework].
	void nonRepeatNumberFrmCollections(int[] intArray) {
		LinkedHashMap<Integer, Integer> freqEachNum = new LinkedHashMap<Integer, Integer>();
		for (int num : intArray) {
			if (freqEachNum.containsKey(num)) {
				freqEachNum.put(num, freqEachNum.get(num) + 1);
			} else {
				freqEachNum.put(num, 1);
			}
		}
		Iterator<Integer> keyItr = freqEachNum.keySet().iterator();
		while (keyItr.hasNext()) {
			int currentNum = keyItr.next();
			int currenctValue = freqEachNum.get(currentNum);
			if (currenctValue == 1) {
				System.out.println(currentNum);
				break;
			}
		}
	}

	// Program 5 : [VIMP] Find the frequency of each character using map, insertion order should be maintained.
	LinkedHashMap<Character, Integer> freqEachChars(String word) {
		LinkedHashMap<Character, Integer> freqChars = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < word.length(); index++) {
			char currenctChar = word.charAt(index);
			if (freqChars.containsKey(currenctChar)) {
				freqChars.put(currenctChar, freqChars.get(currenctChar) + 1);
			} else {
				freqChars.put(currenctChar, 1);
			}
		}
		return freqChars;
	} // 

	// Program 6 : [VIMP] Find the frequency of each word using map, key's natural order should be maintained.
	TreeMap<String, Integer> freqEachWords(String string) {
		TreeMap<String, Integer> freqWords = new TreeMap<String, Integer>();
		String[] stringArray = string.split(" ");
		for (String word : stringArray) {
			if (freqWords.containsKey(word)) {
				freqWords.put(word, freqWords.get(word) + 1);
			} else {
				freqWords.put(word, 1);
			}
		}
		return freqWords;
	}

	// Program 7 : [VIMP] Find the frequency of each number using map.
	HashMap<Integer, Integer> freqEachnumbers(int[] numbers) {
		HashMap<Integer, Integer> freqNums = new HashMap<Integer, Integer>();
		for (int num : numbers) {
			if (freqNums.containsKey(num)) {
				freqNums.put(num, freqNums.get(num) + 1);
			} else {
				freqNums.put(num, 1);
			}
		}
		return freqNums;
	}

	// Program 8 : Find the number which is repeated the most using collections framework.
	int mostRepeatedNumber(int[] numArray)
		LinkedHashMap<Integer, Integer> freqNums = new LinkedHashMap<Integer, Integer>();
		for (int num : numArray) {
			if (freqNums.containsKey(num)) {
				freqNums.put(num, freqNums.get(num) + 1);
			} else {
				freqNums.put(num, 1);
			}
		}
		int max = 0;
		int currentNumber = 0;
		Iterator<Integer> keyItr = freqNums.keySet().iterator();
		while (keyItr.hasNext()) {
			int number = keyItr.next();
			int currentValue = freqNums.get(number);
			if (max < currentValue) {
				max = currentValue;
				currentNumber = number;
			}
		}
		return currentNumber;
	}

	// Program 9 : Find the word which is repeated the most using collections framework.
	String mostRepeatedWord(String inputString) {
		LinkedHashMap<String, Integer> freqWords = new LinkedHashMap<String, Integer>();
		String[] stringArray = inputString.split(" ");
		for (String word : stringArray) {
			if (freqWords.containsKey(word)) {
				freqWords.put(word, freqWords.get(word) + 1);
			} else {
				freqWords.put(word, 1);
			}
		}
		int max = 0;
		String currentWord = "";
		Iterator<String> keyItr = freqWords.keySet().iterator();
		while (keyItr.hasNext()) {
			String word = keyItr.next();
			int currentValue = freqWords.get(word);
			if (max < currentValue) {
				max = currentValue;
				currentWord = word;
			}
		}
		return currentWord;
	}

	// Program 10 (Optional) : From given string Find the most repeating character using collections framework.
	char mostRepeatedCharacter(String word) {
		LinkedHashMap<Character, Integer> freqChars = new LinkedHashMap<Character, Integer>();
		for (int index = 0; index < word.length(); index++) {
			char character = word.charAt(index);
			if (freqChars.containsKey(character)) {
				freqChars.put(character, freqChars.get(character) + 1);
			} else {
				freqChars.put(character, 1);
			}
		}
		int max = 0;
		char currentChar = ' ';
		Iterator<Character> keyItr = freqChars.keySet().iterator();
		while (keyItr.hasNext()) {
			char character = keyItr.next();
			int currentValue = freqChars.get(character);
			if (max < currentValue) {
				max = currentValue;
				currentChar = character;
			}
		}
		return currentChar;
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();

		// Program 1
		String word = "technocredits";
		System.out.println("Input Word: " + word);
		System.out.print("First non repeating char in above word: ");
		assignment38.nonRepeatCharFirst(word);
		System.out.println();

		// Program 2
		String word2 = "technocredits";
		System.out.println("Input Word: " + word2);
		System.out.print("First non repeating char in above word: ");
		assignment38.nonRepeatCharFrmCollections(word2);
		System.out.println();

		// Program 3
		String inputString = "Hi Hello Hi Techno Hello Credits Globant Super";
		System.out.println("Input String: " + inputString);
		System.out.print("First non repeating char in above word: ");
		assignment38.nonRepeatWordFrmCollections(inputString);
		System.out.println();

		// Program 4
		int[] integerArray = { 10, 33, 44, 22, 10, 99, 33, 44 };
		System.out.println("Input Integer Array: " + Arrays.toString(integerArray));
		System.out.print("First non repeating number in above Integer Array: ");
		assignment38.nonRepeatNumberFrmCollections(integerArray);
		System.out.println();

		// Program 5
		String wordInput = "technocredits";
		System.out.println("Input Word: " + wordInput);
		System.out.println("Frequencies of each characters in above word are below:-");
		System.out.println(assignment38.freqEachChars(wordInput));
		System.out.println();

		// Program 6
		String stringInput = "Hi Hello Hi Techno Hello Credits Globant Super";
		System.out.println("Input String: " + stringInput);
		System.out.println("Frequencies of each words in above string are below:-");
		System.out.println(assignment38.freqEachWords(stringInput));
		System.out.println();

		// Program 7
		int[] integerInputs = { 10, 33, 44, 22, 10, 99, 33, 44 };
		System.out.println("Input Integer Array: " + Arrays.toString(integerInputs));
		System.out.println("Frequencies of each numbers in above array are below:-");
		System.out.println(assignment38.freqEachnumbers(integerInputs));
		System.out.println();

		// Program 8
		int[] intArray = { 10, 11, 13, 14, 10, 11, 11, 11, 14, 34 };
		System.out.println("Input Integer array: " + Arrays.toString(intArray));
		System.out.println("Most repeated number in above array: " + assignment38.mostRepeatedNumber(intArray));
		System.out.println();

		// Program 9
		String strInput = "Hi Hello Hi Techno Hello Credits Globant Super";
		System.out.println("Input String: " + stringInput);
		System.out.println("Most repeated word in above string: " + assignment38.mostRepeatedWord(strInput));
		System.out.println();

		// Program 10
		String inputWord = "akanksha";
		System.out.println("Input Word: " + inputWord);
		System.out.println("Most repeated character in above word: " + assignment38.mostRepeatedCharacter(inputWord));
	}
}