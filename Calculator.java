class Calculator{
	int a = 100;
	int b = 90;
	
	void add(){
		int c = a + b;
		System.out.println("Addition is = "+ c);
	}
	
	void sub(){
		int c = a - b;
		System.out.println("Substraction is = "+ c);
	}
	
	void mul(){
		int c = a * b;
		System.out.println("Multiplication is = "+ c);
	}
	
	void div(){
		int c = a / b;
		System.out.println("Division is = "+ c);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}