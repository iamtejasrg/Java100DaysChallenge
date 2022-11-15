
import java.util.Arrays;
import java.util.Scanner;

public class Assignment30 {

	String replaceWord(String inputString, String wordToBeReplaced, int ocuuranceFromLast, String targetWord) {
		String[] inputStringArray = inputString.split(" ");
		int count = 0;
		for (int index = inputStringArray.length - 1; index >= 0; index--) {
			if (inputStringArray[index].equalsIgnoreCase(wordToBeReplaced)) {
				count++;
				if (count == ocuuranceFromLast) {
					inputStringArray[index] = targetWord;
					break;
				}
			}
		}
		inputString = Arrays.toString(inputStringArray).replace("[", "").replace(",", "").replace("]", "");
		return inputString;
//		String output = inputString.join(" ", inputStringArray);
//		return output;
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter words below:-");
		String words = scanner.nextLine();
		System.out.println("Enter word to be replaced:-");
		String toBeReplaced = scanner.next();
		System.out.println("Enter occurance from the last:-");
		int occuranceFromTheLast = scanner.nextInt();
		System.out.println("Enter target word:-");
		String target = scanner.next();
		System.out.println();
		if (occuranceFromTheLast == 1) {
			System.out
					.println(occuranceFromTheLast + "st last -" + toBeReplaced + "- updated with -" + target + "- :-");
		} else if (occuranceFromTheLast == 2) {
			System.out
					.println(occuranceFromTheLast + "nd last -" + toBeReplaced + "- updated with -" + target + "- :-");
		} else if (occuranceFromTheLast == 3) {
			System.out
					.println(occuranceFromTheLast + "rd last -" + toBeReplaced + "- updated with -" + target + "- :-");
		} else if (occuranceFromTheLast > 3 && occuranceFromTheLast <= 20) {
			System.out
					.println(occuranceFromTheLast + "th last -" + toBeReplaced + "- updated with -" + target + "- :-");
		}
		System.out.println(assignment30.replaceWord(words, toBeReplaced, occuranceFromTheLast, target));
		scanner.close();
	}
}