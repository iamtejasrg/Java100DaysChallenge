import java.util.Arrays;

public class Test6 {

	int maxNumber(int[] arrayIntForMaxValue) {
		int maxNum = arrayIntForMaxValue[0];
		for (int num : arrayIntForMaxValue) {
			if (num > maxNum) {
				maxNum = num;
			}
		}
		return maxNum;
	}

	int[] negativeIntArray(int[] intArrayNegative) {
		int[] newArray = new int[intArrayNegative.length];
		int count = 0;
		for (int index = 0; index < intArrayNegative.length; index++) {
			if (intArrayNegative[index] < 0) {
				newArray[count] = intArrayNegative[index];
				count++;
			}
		}
		newArray = Arrays.copyOf(newArray, count);
		return newArray;
	}

	public static void main(String[] args) {
		Test6 test6 = new Test6();

		int[] inuptIntArray = { 13, 2, -4, -8, -2, 12 };
		System.out.print("Closest Number to 0 in given Array "+Arrays.toString(inuptIntArray)+" --> ");
		System.out.println(test6.maxNumber(test6.negativeIntArray(inuptIntArray)));

		int[] inuptIntArray2 = { 4,-13, 11,17,-7, -33};
		System.out.print("Closest Number to 0 in given Array "+Arrays.toString(inuptIntArray2)+" --> ");
		System.out.println(test6.maxNumber(test6.negativeIntArray(inuptIntArray2)));
	}
}