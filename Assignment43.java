/*Assignment - 43 : 11th Jun'2022
Pattern 1:
1
2 2
3 3 3 
4 4 4 4
----------------------------
Pattern 2:
1
1 2
1 2 3
1 2 3 4 
---------------------------
Pattern 3:
#
 
# # #
   
----------------------------------------
Pattern 4:
1
 
2 3 4
   
5 6 7 8 9
     
-------------------------
Pattern 5:
A
A B
A B C
A B C D
-----------------------
Pattern 6:
1
2 2
3 3 3
4 4 4 4 
--------------------------
Pattern 7 :
#  # 
 #  #
#  # 
 #  #
--------------------------
Pattern 8 :
    1
   12
  123
 1234*/



public class Assignment43 {

	// Pattern 1
	void pattern1() {
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(index + " ");
			}
			System.out.println();
		}
	}

	// Pattern 2
	void pattern2() {
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(innerIndex + " ");
			}
			System.out.println();
		}
	}

	// Pattern 3
	void pattern3() {
		for (int index = 1; index <= 3; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				if (index % 2 != 0)
					System.out.print("# ");
			}
			System.out.println();
		}
	}

	// Pattern 4
	void pattern4() {
		int num = 1;
		for (int index = 1; index <= 5; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				if (index % 2 != 0)
					System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

	// Pattern 5
	void pattern5() {
		for (int index = 1; index <= 4; index++) {
			char ch = 'A';
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	// Pattern 6
	void pattern6() {
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(index + " ");
			}
			System.out.println();
		}
	}

	// Pattern 7
	void pattern7() {
		for (int index = 1; index <= 4; index++) {
			for (int innerIndex = 1; innerIndex <= 4; innerIndex++) {
				if (index % 2 == 0) {
					if (innerIndex % 2 == 0) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				} else {
					if (innerIndex % 2 != 0) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	// Pattern 8
	void pattern8() {
		for (int index = 1; index <= 4; index++) {
			int count = 1;
			for (int innerIndex = 1; innerIndex <= 4; innerIndex++) {
				if (innerIndex <= (4 - index)) { 
					System.out.print(" ");
				} else {
					System.out.print(count++);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		System.out.println("---Execution starts---");

		// Program 1
		System.out.println("-:Pattern 1:-");
		assignment43.pattern1();
		System.out.println("--------------------------");

		// Program 2
		System.out.println("-:Pattern 2:-");
		assignment43.pattern2();
		System.out.println("--------------------------");

		// Program 3
		System.out.println("-:Pattern 3:-");
		assignment43.pattern3();
		System.out.println("--------------------------");

		// Program 4
		System.out.println("-:Pattern 4:-");
		assignment43.pattern4();
		System.out.println("--------------------------");

		// Program 5
		System.out.println("-:Pattern 5:-");
		assignment43.pattern5();
		System.out.println("--------------------------");

		// Program 6
		System.out.println("-:Pattern 6:-");
		assignment43.pattern6();
		System.out.println("--------------------------");

		// Program 7
		System.out.println("-:Pattern 7:-");
		assignment43.pattern7();
		System.out.println("--------------------------");

		// Program 8
		System.out.println("-:Pattern 8:-");
		assignment43.pattern8();
		System.out.println();
		System.out.println("Execution successfully completed");
	}
}