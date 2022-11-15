/*Assignment - 40 : 7th Jun'2022
Create a POJO call called Shopkeeper, having fields name, profit, location.
Create a constructor to initialize instance variable.
Create a ShopkeepTest class, create a method call getShopkeepList which should return List<Shopkeeper> in sorted order of their profits. Print the returned list in main method.
Input : Mohan, 450000, Baner
        Vijay, 980000, Balewadi
		Nandan, 762300, Viman nagar
output : [Vijay--980000--Balewadi, Nandan--762300--Viman nagar, Mohan--450000--Baner]
Hint : Override toString() and implements comparable interface*/


public class Assignment40_Shopkeeper implements Comparable<Assignment40_Shopkeeper> {

	private String name;
	private int profit;
	private String location;

	public Assignment40_Shopkeeper(String name, int profit, String location) {
		this.name = name;
		this.profit = profit;
		this.location = location;
	}

	@Override
	public String toString() {
		return name + "--" + profit + "--" + location;
	}

	@Override
	public int compareTo(Assignment40_Shopkeeper o) {
		return o.profit - this.profit;
	}
}