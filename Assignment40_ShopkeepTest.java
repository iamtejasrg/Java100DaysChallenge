/*Assignment - 40 : 7th Jun'2022
Create a POJO call called Shopkeeper, having fields name, profit, location.
Create a constructor to initialize instance variable.
Create a ShopkeepTest class, create a method call getShopkeepList which should return List<Shopkeeper> in sorted order of their profits. Print the returned list in main method.
Input : Mohan, 450000, Baner
        Vijay, 980000, Balewadi
		Nandan, 762300, Viman nagar
output : [Vijay--980000--Balewadi, Nandan--762300--Viman nagar, Mohan--450000--Baner]
Hint : Override toString() and implements comparable interface*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment40_ShopkeepTest {

	List<Assignment40_Shopkeeper> getShopKeepList() {
		Assignment40_Shopkeeper shopkeeper1 = new Assignment40_Shopkeeper("Mohan", 450000, "Baner");
		Assignment40_Shopkeeper shopkeeper2 = new Assignment40_Shopkeeper("Vijay", 980000, "Balewadi");
		Assignment40_Shopkeeper shopkeeper3 = new Assignment40_Shopkeeper("Nandan", 762300, "Viman nagar");

		List<Assignment40_Shopkeeper> shopKeeperList = new ArrayList<Assignment40_Shopkeeper>();
		shopKeeperList.add(shopkeeper1);
		shopKeeperList.add(shopkeeper2);
		shopKeeperList.add(shopkeeper3);

		Collections.sort(shopKeeperList);
		return shopKeeperList;

	}

	public static void main(String[] args) {
		System.out.println(new Assignment40_ShopkeepTest().getShopKeepList());
	}
}