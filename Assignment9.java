public class Assignment9 {
	double count, sum;
	double avg;

	void primeNumber(int num) {

		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(" Prime Number : " + num);
			count++;
			sum = sum + num;
			avg = sum / count;
		}
	}

	void parameterizedprime(int startrange, int endrange) {
		for (int i = startrange; i <= endrange; i++) {
			primeNumber(i);
		}
		System.out.println("*******************************");
		System.out.println("Count of Prime Number is " + count);
		System.out.println("Sum of Prime Number is " + sum);
		System.out.println("Average of Prime Number is " + avg);
	}

	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.primeNumber(7);
		assignment9.parameterizedprime(100, 120);
	}
}