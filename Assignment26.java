import java.util.Arrays;
import java.util.Scanner;
public class Assignment26 {
	final int[] fibonacciSeries(int NthIteratons) {
		final int fibonacciNumber1st = 0;
		final int fibonacciNumber2nd = 1;
		int[] fibonacciSeries = new int[NthIteratons];
		if (NthIteratons == 1) {
			fibonacciSeries[0] = fibonacciNumber1st;
		} else {
			fibonacciSeries[0] = fibonacciNumber1st;
			fibonacciSeries[1] = fibonacciNumber2nd;
		}
		int index = 2;
		while (index <= NthIteratons - 1) {
			fibonacciSeries[index] = fibonacciSeries[index - 2] + fibonacciSeries[index - 1];
			index++;
		}
		return fibonacciSeries;
	}
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter required iteration(s) of fibonacci series:-");
		int userDefinedNthIteration = scanner.nextInt();
		if (userDefinedNthIteration < 1) {
			System.out.println("Invalid iteration number");
		} else if (userDefinedNthIteration >= 1) {
			System.out.println("Fibonacci series till " + userDefinedNthIteration + " iteration(s)");
			System.out.println(Arrays.toString(assignment26.fibonacciSeries(userDefinedNthIteration)));
		}
		scanner.close();
	}
}