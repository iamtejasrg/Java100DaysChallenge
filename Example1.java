class Example1
{
	int num1 =  11;
	int num2 = 	25;

	void updateNumbers()
	{
		num1 = num1 + num2;
		num1 = 5;
		num2 = 6;	
	}
	void display()
	{
		System.out.println(num1+num2);
	}
	public static void main(String [] args)
	{
		Example1 example1 =  new Example1();
		example1.display();
		example1.updateNumbers();

	}
}