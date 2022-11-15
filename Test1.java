public class Test1 {

	void numDivisibleBy(int startNum, int endNum) {

		for (int no = startNum; no <= endNum; no++) {

			if (no % 3 == 0 && no % 5 == 0)
				System.out.println(no + " is divisible by 3 & 5");
			else if (no % 3 == 0)
				System.out.println(no + " is divisible by 3");
			else if (no % 5 == 0)
				System.out.println(no + " is divisible by 5");
			else
				System.out.println(no + " is divisible by 5");
		}
	}

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.numDivisibleBy(1, 100);
	}
}