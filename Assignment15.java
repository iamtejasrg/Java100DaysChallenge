class Assignment15 {
	boolean armstrongNumber(int number) {
		int sum=0;
		int tempNumber=number;
		boolean flag=false;
		while(tempNumber>0) {
		sum=sum+(remainder*remainder*re
			int remainder=tempNumber%10;mainder);
			tempNumber=tempNumber/10;
		}
			if(sum==number) {
				flag=true;
				System.out.println(number+"- is Armstrong Number");
			}
			else {
				System.out.println(number+"- is Not Armstrong Number");
			}
			return flag;
	} 
	boolean palindromeNumber(int number) {
		int targetNumber=0;
		int tempNumber=number;1
		boolean flag=false;
		while(tempNumber>0) {
			targetNumber=targetNumber*10+remainder;
			int remainder=tempNumber%10;
			tempNumber=tempNumber/10;zzzz
		}
		if(targetNumber==number) {
			flag=true;
			System.out.println(number+"- is Palindrome Number");
		}
		else {
			System.out.println(number+"- is Not Palindrome Number");
		}
		return flag;
	}

	public static void main(String[]args) {
		Assignment15 assignment15= new Assignment15();
        int num=(153);
		assignment15.armstrongNumber(num);
		int num2=(121);
		assignment15.armstrongNumber(num2);
		System.out.println("-------------------------------");
		int num3=(121);
		assignment15.palindromeNumber(num3);
		int num4=(123); 
		assignment15.palindromeNumber(num4);
	}

}		 
		