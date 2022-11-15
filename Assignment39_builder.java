/*Assignment - 39 : 5th Jun'2022
WAP to fulfill below requirement. 
Create a POJO call called Builder, having fields buildname, revenue, reraNumber.
Create a constructor to initialize instance variable.
Create getter methods to get the values of each instance variable.
Create a client class, create a method call getBuilderInfo which should return List<Builder>.
Print all the detail of builder having maximum revenue.
Input : Rohan, 450000, 45453434
        Kalpataru, 980000, 32343565
		Nandan, 762300, 87126722
output : Kalpataru builder having highest revenue.
         Rera number : 32343565
		 Revenue : 980000
Note : In case you need help, please refer Example15 [package - technoCredits.collectionsframework.listdemo]*/


public class Assignment39_builder {

	private String builderName;
	private int revenue;
	private int reraNumber;

	Assignment39_builder(String buildName, int revenue, int reraNumber) {
		this.builderName = buildName;
		this.revenue = revenue;
		this.reraNumber = reraNumber;
	}

	String getBuildName() {
		return builderName;
	}

	int getRevenue() {
		return revenue;
	}

	int getReraNumber() {
		return reraNumber;
	}

	public String toString() {
		return builderName + " " + revenue + " " + reraNumber;
	}
}