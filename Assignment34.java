import java.util.Arrays;

public class Assignment34 {

	boolean isNumPrime(int num) {
		boolean isPrime = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	// Program 1 : WAP to return all prime numbers from a given array.
	int[] primesInArray(int[] inputArray) {
		int index = 0;
		for (int num : inputArray) {
			if (isNumPrime(num))
				inputArray[index++] = num;
		}
		int[] primeArray = Arrays.copyOf(inputArray, index);
		return primeArray;
	}

	int digitCountInString(String stringInput) {
		int count = 0;
		for (int index = 0; index < stringInput.length(); index++) {
			if (Character.isDigit(stringInput.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	// Program 2 : WAP to find String having maximum digits from given Array.
	String maxLengthString(String[] nameArray) {
		int maxDigitInString = 0;
		String stringWithMaxDigit = "";
		for (String name : nameArray) {
			if (digitCountInString(name) > maxDigitInString) {
				maxDigitInString = digitCountInString(name);
				stringWithMaxDigit = name;
			}
		}
		return stringWithMaxDigit;
	}

	// Program 3 
	String[] nameLStartsKContainsN(String[] namesArray, char LNStartWith, char LNContains) {
		int index = 0;
		for (String fullName : namesArray) {
			String[] name = fullName.split(" ");
			String lastName = name[1];
			if (lastName.startsWith(String.valueOf(LNStartWith))) {
				if (lastName.contains(String.valueOf(LNContains))) {
					namesArray[index++] = fullName;
				}
			}
		}
		String[] specificNames = Arrays.copyOf(namesArray, index);
		return specificNames;
	}

	int reverseNum(int num) {
		int revNum = 0;
		while (num > 0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
		}
		return revNum;
	}

	// Program 4 : Reverse all numbers in a given array.
	int[] reverseNumInArray(int[] numArray) {
		int[] reversedNumArray = new int[numArray.length];
		for (int index = 0; index < numArray.length; index++) {
			reversedNumArray[index] = reverseNum(numArray[index]);
		}
		return reversedNumArray;
	}

	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();

		// Program 1
		int[] intArray = { 10, 33, 41, 17, 99, 22, 19 };
		System.out.println("Input Array: " + Arrays.toString(intArray));
		System.out.println("All Primes Array: " + Arrays.toString(assignment34.primesInArray(intArray)));
		System.out.println();

		// Program 2
		String[] strArray = { "Sa1n2desh", "S1h1as6ha4n4k", "P3riyanka", "Rahu9l", "An7kita" };
		System.out.println("Input Array: " + Arrays.toString(strArray));
		System.out.println("String having max digits: " + assignment34.maxLengthString(strArray));
		System.out.println();

		// Program 3
		String[] fullNamesArray = { "aashvi kanani", "piyush khojawala", "aashish savsani", "Mrunal kotwani" };
		char startswith = 'k';
		char contains = 'n';
		System.out.println("Input Names Array: " + Arrays.toString(fullNamesArray));
		System.out.print(
				"Names Array, Having lastname starts with '" + startswith + "' and contains '" + contains + "': ");
		System.out.println(Arrays.toString(assignment34.nameLStartsKContainsN(fullNamesArray, startswith, contains)));
		System.out.println();

		// Program 4
		int[] numberArray = { 471, 443, 749 };
		System.out.println("Number Array: " + Arrays.toString(numberArray));
		System.out.println("NumberReversed Array: " + Arrays.toString(assignment34.reverseNumInArray(numberArray)));
	}
}