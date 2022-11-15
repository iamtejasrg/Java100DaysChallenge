 public class Assignment17 {
	boolean isPrime(int num) {
		boolean flag = true;
		for(int index=2;index<num;index++) {
			if(num%index==0){
				flag = false;
				break;
			}
		}
		return flag;
	}

	void primeNumInRange(int sRange,int eRange,int N) {
		int count = 0;
		for(int index=sRange;index<=eRange;index++) {
			boolean primeFlag = isPrime(index);
			if(primeFlag==true) {
				if(count<N) {
					count++;
					System.out.println(index);
				}
			}
		}
	}

	void ageDiff(int[] arr) {
		int maxAge =0, minAge =0;
		maxAge = arr[0];
		minAge =arr[0];
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>maxAge) {
				maxAge = arr[index];
			}else {
				minAge =arr[index];
			}
		}
		int agediff = maxAge>minAge?(maxAge-minAge):(minAge-maxAge);
		System.out.println("difference between oldest and youngest family members "+ agediff);	
	}
	public static void main(String[] args) {
		Assignment17 firstNPrimeNumbers = new Assignment17();
		firstNPrimeNumbers.primeNumInRange(50,500,3);
		int[] age = {10,34,38,68,72,95,6};
		firstNPrimeNumbers.ageDiff(age);
	}
}