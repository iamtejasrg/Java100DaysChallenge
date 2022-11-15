import java.util.Arrays;

public class Test4 {
	int visibleTreesAre(int[] input) {
		System.out.println("input: " + Arrays.toString(input));
		int count = 1;
		int maxCount = input[0];
		for (int index = 1; index < input.length; index++) {
			if (input[index] > maxCount) {
				count++;
				maxCount = input[index];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		int[] input1 = { 5, 5, 9, 11, 10, 17, 33, 29 };
		System.out.println("Visible trees are: " + test4.visibleTreesAre(input1) + "\n");
		int[] input2 = { 11, 9, 10, 5, 7 };
		System.out.println("Visible trees are: " + test4.visibleTreesAre(input2) + "\n");
		int[] input3 = { 3, 5, 9, 13 };
		System.out.println("Visible trees are: " + test4.visibleTreesAre(input3) + "\n");
	}

}