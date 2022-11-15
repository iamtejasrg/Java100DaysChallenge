
public class Assignment12 {
	int maxDigitNum = 0;
	String maxDigitString ="";
	int sum=0;
	String maxStringLen(String[] name) {
		int maxlen = 0;
		String maxLenStr = "";
		for(int index=0;index<name.length;index++) {
			if(name[index].length()>maxlen) {
				maxlen = name[index].length();
				maxLenStr = name[index];
			}
		}
		System.out.println(maxlen);
		return maxLenStr;
	}
	void maxDigitString(String name) {
		int maxdigit = 0;
		for(int index= 0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				maxdigit++;
			}
		}
		System.out.println(name +"-->" + maxdigit);
	}
	void maxDigitStringArray(String[] name) {
		for(int index=0;index<name.length;index++) {
			maxDigitString(name[index]);
		}
	}
	boolean noCapitalString(String name) {
		boolean count =false;
		String str = name;
		for(int index=0;index<name.length();index++){
			char ch = name.charAt(index);
			if(Character.isUpperCase(ch)){
				count =true;
				break;
			}	
		}
		return count;
	}
	void nouppercaseArray() {
		String[] name = {"Ma1ul2iK", "h9arsh", "K1r3i4sh7N8a", "AasHvi", "PrA1t2i3k4", "rakesh"};
		for(int index=0;index<name.length;index++) {
			boolean flag =noCapitalString(name[index]);
			if(flag==false) {
				System.out.println(name[index]);
			}
		}
	}
	void findDigit(String name){
		int count=0;
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		if(maxDigitNum<count) {
			maxDigitNum=count;
			maxDigitString= name;
		}
		//System.out.println(name+ " -- "+count);
	}
	String findDigitFromArray(String[] name) {
		for(int index=0;index<name.length;index++) {
			findDigit(name[index]);
		}
		System.out.println(maxDigitString+ " -- "+maxDigitNum);
		return maxDigitString;
	}
	void sumOfString(String name) {

		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				sum= sum+Character.getNumericValue(ch);	
			}
		}
	}
	void findSumFromArray(String[] arr1) {
		for(int index=0;index<arr1.length;index++) {
			sumOfString(arr1[index]);
		}
		System.out.println("sum of digit in Array "+ sum);
	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		String[] data = {"Maulik", "Tamanna", "Technocredits","Aashvi"};
		String str =assignment12.maxStringLen(data);
		System.out.println(str + " having a maximum lenght");
		String[] strArray = {"Ma1ul2ik", "H9arsh", "K1r3i4sh7n8a", "Aashvi", "Pra1t2i3k4"};
		assignment12.maxDigitStringArray(strArray);
		String[] stringArray = {"Ma1ul2iK", "h9arsh", "K1r3i4sh7N8a", "AasHvi", "PrA1t2i3k4", "rakesh"};
		assignment12.nouppercaseArray();
		String[] name = {"Ma1ul2iK", "h9arsh", "K1r3i4sh7N8a", "AasHvi", "PrA1t2i3k4", "rakesh"};
		String str1=assignment12.findDigitFromArray(name);
		System.out.println(str1);
		String[] newArray = {"H1i2", "Tech9no", "cr5edits"};
		assignment12.findSumFromArray(newArray);
	}
}