class Assignment6{

	void findNumReqToGetSum100(){
		int sum = 0 , num = 1 , count = 0;
		
		while(sum <= 100){
			sum = sum + num;
			num++;
			count++;
		}
		System.out.println("\n" + count +" numbers required to generate sum 100\n");
	}
	
	void printFirst3NumDivisibleBy17and13(int startNum, int endNum){
	
		System.out.println("\nFirst 3 Numbers divisible by 17 and 13 are:");
		int count = 0;
		
			while(startNum <= endNum){
				
				if(count < 3){
					if (startNum % 13 == 0){
						System.out.println(startNum + " is divisible by 13.");
						count++;
					}
					else if (startNum % 17 == 0){
						System.out.println(startNum + " is divisible by 17.");
						count++;
					}
				}
				startNum++;
			}
	}
	
	void printFirst2NumDivisibleBy5and7(int startNum, int endNum){
	
		System.out.println("\nFirst 2 Numbers divisible by 5 and 7 are:");
		int count = 0;
		
			while(startNum <= endNum){
				
				if(count < 2){
					if (startNum % 5 == 0){
						System.out.println(startNum + " is divisible by 5.");
						count++;
					}
					else if (startNum % 7 == 0){
						System.out.println(startNum + " is divisible by 7.");
						count++;
					}
				}
				startNum++;
			}
	}
	
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.findNumReqToGetSum100();
		assignment6.printFirst3NumDivisibleBy17and13(5,40);
		assignment6.printFirst2NumDivisibleBy5and7(10,20);
	}
}