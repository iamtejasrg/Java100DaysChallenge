class Assignment7 {
	
	String fName="Tejas";
	String mName="Ramdas";
	String lName="Gorde";
	String dOB="07-JUNE-2001";
	String address="A-201, Sanskriti Enclave, Maharashtra";
	int rollNumber=201;
	
	void studentName() {
		System.out.println(fName);
		System.out.println(mName);
		System.out.println(lName);
		System.out.println("************************************");
	}

	void studentOtherDetails( ){
		System.out.println(dOB);
		System.out.println(address);
		System.out.println(rollNumber);
		System.out.println("************************************");
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.studentName();
		assignment7.studentOtherDetails();
	}
}