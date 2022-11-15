import java.util.Arrays;

public class Test7 {

	void checkValidNumber(int[] intArr) {
		for(int index1 = 0; index1 < intArr.length; index1++) {
			int sum = 0;
			for(int index2 = index1+1; index2 < intArr.length; index2++) {
				sum += intArr[index2];
			}
			if(intArr[index1] != sum) {
				System.out.println("Invalid number at index "+index1);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Test7 test7 = new Test7();

		int[] inputArray = {10,5,3,2};
		System.out.println(Arrays.toString(inputArray));
		test7.checkValidNumber(inputArray);
		System.out.println();
		int[] inputArray2 = {10,5,3,3,-1};
		System.out.println(Arrays.toString(inputArray2));
		test7.checkValidNumber(inputArray2);
	}

}