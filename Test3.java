public class Test3 {

	int getMaxNo (int[] array) {
		int getMaxNo=array[0];	
		for(int index=1;index<array.length;index++) {
			if(array[index]>getMaxNo) {
				getMaxNo=array[index];
			}
		}
		return getMaxNo;
	}
	int getMinNo(int[]array1) {
		int getMinNo=array1[0];	
		for(int index=1;index<array1.length;index++) {
			if(array1[index]<getMinNo) {
				getMinNo=array1[index];
			}
		}
		return getMinNo;
	}
public static void main(String[] args) {
    Test3 test3=new Test3();
	int[] num= {10,93,88,44,103,33,2};
	System.out.println("Maximum no is "+test3.getMaxNo(num));

	int[] num1= {10,93,88,44,103,33,2,11};
    System.out.println("Minimum no is "+test3.getMinNo(num1));
	

	
}
}