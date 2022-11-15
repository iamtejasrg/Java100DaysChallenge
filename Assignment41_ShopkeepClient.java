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


import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment41_ShopkeepClient {

	Set<Assignment41_ShopkeeperDetails> getSetOfShopkeeper() {
		Assignment41_ShopkeeperDetails shopKeeperName1 = new Assignment41_ShopkeeperDetails("Mohan", 450000, "Baner");
		Assignment41_ShopkeeperDetails shopKeeperName2 = new Assignment41_ShopkeeperDetails("Vijay", 980000, "Balewadi");
		Assignment41_ShopkeeperDetails shopKeeperName3 = new Assignment41_ShopkeeperDetails("Nandan", 762300, "Viman nagar");
		Assignment41_ShopkeeperDetails shopKeeperName4 = new Assignment41_ShopkeeperDetails("Nitin", 762300, "Viman nagar");
		Assignment41_ShopkeeperDetails shopKeeperName5 = new Assignment41_ShopkeeperDetails("Mohan", 450000, "Baner");
		Assignment41_ShopkeeperDetails shopKeeperName6 = new Assignment41_ShopkeeperDetails("Mohan", 450000, "Balewadi");

		Set<Assignment41_ShopkeeperDetails> shopKeeperSet = new LinkedHashSet<Assignment41_ShopkeeperDetails>();
		shopKeeperSet.add(shopKeeperName1);
		shopKeeperSet.add(shopKeeperName2);
		shopKeeperSet.add(shopKeeperName3);
		shopKeeperSet.add(shopKeeperName4);
		shopKeeperSet.add(shopKeeperName5);
		shopKeeperSet.add(shopKeeperName6);

		return shopKeeperSet;
	}

	public static void main(String[] args) {
		System.out.println(new Assignment41_ShopkeepClient().getSetOfShopkeeper());
	}
}