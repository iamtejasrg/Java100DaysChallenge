import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment29TryCatchBlock {

	void sumOfNumInString(String str) {
		int sum = 0;
		String[] input = str.split(" ");
		for(String i : input) {
			try{
				int num = Integer.parseInt(i);
				sum += num;
			}catch(NumberFormatException ne){
			 }
		}
		System.out.println("Sum of the numbers in string is "+sum);
	}

	void maxValidNum(int[] arr) {
		int max=0;
		for(int i : arr) {
			if(i>max)
				max=i;
		}
		System.out.println("Maximum Number from given input is "+max);

	}

	public static void main(String[] args) {
		System.out.println("Output of Program 1");
		new Assignment29TryCatchBlock().sumOfNumInString("I have 5 years and 10 months of experience in automation");

		System.out.println("------------------------------------------");
		int count = 0;
		int [] arr = new int[3];
		while(count!=3) {			
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Any number : ");
				int num = sc.nextInt();	
				arr[count] = num;
				count++;
			}catch(InputMismatchException ie) {
				System.out.println("Please enter Valid Input");
			}

		}
		System.out.println("Output of Program 2");
		new Assignment29TryCatchBlock().maxValidNum(arr);

	}
}