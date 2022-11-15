class Student{
	String name="Tejas";
	int rno=1;
	
	void displayInfo(){
		System.out.println(name); // name -> Tejas //4
		System.out.println(rno); //5
	} //6
	
	public static void main(String[] args){
		System.out.println("Hello"); //1
		Student std = new Student(); //2
		std.displayInfo(); //3
		System.out.println("Hi"); //7
	} //7
}
