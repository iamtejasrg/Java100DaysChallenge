public class Test2 {

	int maggiAvailableQ = 50;
	int dosaAvailableQ = 43;
	int pouchesAvailableQ = 39;
	int panipuriAvailableQ = 43;
	int masalaAvailableQ = 73;

	void shopping(int maggieQ, int dosaQ, int pouchesQ, int panipuriQ, int masalaQ)
	{

		int availableMaggie = maggiAvailableQ - maggieQ;
		int availableDosa = dosaAvailableQ - dosaQ;
		int availablePouches = pouchesAvailableQ - pouchesQ;
		int availablePanipuri = panipuriAvailableQ - panipuriQ;
		int availableMasala = masalaAvailableQ - masalaQ;

		if(availableMaggie == 0)
			System.out.println("Maggie is running out of stock");
		else
			System.out.println("Maggie available in stock. Quantity : "+availableMaggie);

		if(availableDosa == 0)
			System.out.println("Dosa is running out of stock");
		else
			System.out.println("Dosa available in stock. Quantity : "+availableDosa);

		if(availablePouches == 0)
			System.out.println("Pouches are running out of stock");
		else
			System.out.println("Pouches are available in stock. Quantity : "+availablePouches);

		if(availablePanipuri == 0)
			System.out.println("Panipuri is running out of stock");
		else
			System.out.println("Panipuri available in stock. Quantity : "+availablePanipuri);

		if(availableMasala == 0)
			System.out.println("Masala is running out of stock");
		else
			System.out.println("Masala available in stock. Quantity : "+availableMasala);	
	}

	public static void main(String[] args) {

		Test2 test2=new Test2();
		test2.shopping(50,41,30,42,73);

	}
}