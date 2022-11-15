import java.util.Arrays;

public class Assignment14 {

	String[] getReverseElementPosition(String[] array) {
		System.out.println(Arrays.toString(array));
		for(int startIndex=0, endIndex=array.length-1; startIndex<endIndex; startIndex++,endIndex--) {
			String temp= array[startIndex];
			array[startIndex]=array[endIndex];
			array[endIndex]=temp;
		}
		return array;
	}

	String getReverseTheElement(String string) {
		for(int startIndex=0,endIndex=string.length()-1; startIndex<endIndex; startIndex++,endIndex--) {
			char ch1=string.charAt(startIndex);
			char ch2=string.charAt(endIndex);
			char temp=' ';
			temp=ch1;
			ch1=ch2;
			ch2=temp;
			if(startIndex==0)
				string=ch1+string.substring(startIndex+1, endIndex)+ch2;
			else
				string=string.substring(0,startIndex)+ch1+string.substring(startIndex+1,endIndex)+ch2+string.substring(endIndex+1);
		}
		return string;
	}

	String[] getReverseTheElementInArray(String[] array2) {
		System.out.println(Arrays.toString(array2));
		for(int index=0; index<array2.length ;index++) {
			array2[index]=getReverseTheElement(array2[index]);
		}
		System.out.println(Arrays.toString(array2));
		return array2;
	}

	String[] getReverseElementAndReversePosition(String[] array3) {
		System.out.println(Arrays.toString(array3));
		for(int startIndex=0, endIndex=array3.length-1; startIndex<endIndex; startIndex++,endIndex--) {
			String temp= array3[startIndex];
			array3[startIndex]=array3[endIndex];
			array3[endIndex]=temp;
			array3[startIndex]=getReverseTheElement(array3[startIndex]);
		}
		System.out.println(Arrays.toString(array3));
		return array3;
	}
	String rMM3HajE69NqCYKEopPpk4x2PWxn4bA1ze(String string1, String string2) {
		System.out.println(string1+"-"+string2);
		string1=string1+string2;
		string2=string1.substring(0,string1.length()-string2.length());
		string1=string1.substring(string2.length());	
		System.out.println(string1+"-"+string2);
		return string1+"-"+string2;
	}

	int getReverseNumber(int num) {
		System.out.println("input->"+num);
		int revNum=0;
		while(num>0)
		{
			int remainder=num % 10;
			revNum=revNum * 10 + remainder;
			num=num/10;
		}
		System.out.println("output->"+revNum);
		return revNum;
	}

	public static void main(String[]args) {
		Assignment14 assignment14= new Assignment14();
		String[] array= {"Prachi", "Prasad", "Nilofar", "Amar", "Dipali"};
		assignment14.getReverseElementPosition(array);
		System.out.println("Reverse array->");
		System.out.println(Arrays.toString(array));
		System.out.println();
		String[] array2= {"Prachi", "Prasad"};
		assignment14.getReverseTheElementInArray(array2);
		System.out.println();
		String[] array3= {"Prachi", "Prasad", "Nilofar", "Amar", "Dipali"};
		assignment14.getReverseElementAndReversePosition(array3);
		System.out.println();
		assignment14.rMM3HajE69NqCYKEopPpk4x2PWxn4bA1ze("Techno", "Credits");
		System.out.println();
		assignment14.getReverseNumber(123);
	}
}