class PetrolPump{
	
	void fillFuel(int amount){
	System.out.println("Topup Fuel is " + amount);
	}
	
	public static void main(String[] args){
		PetrolPump petrolpump = new PetrolPump();
		petrolpump.fillFuel(50);
		petrolpump.fillFuel(100);
	}
}