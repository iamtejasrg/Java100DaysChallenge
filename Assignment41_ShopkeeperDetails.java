/*Assignment - 41 : 7th Jun'2022(
Create a POJO call called ShopkeeperDetails, having fields name, profit, location.
Create a constructor to initialize instance variable.
Create a ShopkeepClient class, create a method call getSetOfShopkeeper which should return Set<ShopkeeperDetails>, considering Name of shopperkeeper,profit and location should be unique.
Input : Mohan, 450000, Baner
        Vijay, 980000, Balewadi
		Nandan, 762300, Viman nagar
		Nitin, 762300, Viman nagar
		Mohan, 450000, Baner
		Mohan, 450000, Balewadi
        
output : [Mohan--450000--Baner, Vijay--980000--Balewadi, Nandan--762300--Viman nagar,  Nitin--762300-- Viman nagar, Mohan--450000--Balewadi]
Hint : Override equals and hashcode method.*/


public class Assignment41_ShopkeeperDetails {

	private String name;
	private int profit;
	private String location;

	public Assignment41_ShopkeeperDetails(String name, int profit, String location) {
		this.name = name;
		this.profit = profit;
		this.location = location;
	}

	@Override
	public String toString() {
		return name + " - " + profit + " - " + location;
	}

	@Override
	public int hashCode() {
		// return this.profit;
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Assignment41_ShopkeeperDetails assignment41_ShopkeeperDetails = (Assignment41_ShopkeeperDetails) obj;
		// this.name.equals(assignment41_ShopkeeperDetails.name)
		return this.profit == assignment41_ShopkeeperDetails.profit	&& this.location.equals(assignment41_ShopkeeperDetails.location);
	}
}