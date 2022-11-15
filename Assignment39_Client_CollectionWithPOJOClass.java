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


import java.util.ArrayList;
import java.util.List;

public class Assignment39_Client_CollectionWithPOJOClass {

	List<Assignment39_builder> getBuilderinfo() {
		Assignment39_builder Builder1 = new Assignment39_builder("Rohan", 45000, 45453434);
		Assignment39_builder Builder2 = new Assignment39_builder("Kalpataru", 980000, 32343565);
		Assignment39_builder Builder3 = new Assignment39_builder("Nandan", 762300, 87126722);

		List<Assignment39_builder> builderList = new ArrayList<Assignment39_builder>();
		builderList.add(Builder1);
		builderList.add(Builder2);
		builderList.add(Builder3);

		return builderList;
	}

	public static void main(String[] args) {
		Assignment39_Client_CollectionWithPOJOClass assignment39_Client_CollectionWithPOJOClass = new Assignment39_Client_CollectionWithPOJOClass();
		List<Assignment39_builder> listOfBuilder = assignment39_Client_CollectionWithPOJOClass.getBuilderinfo();

		Assignment39_builder maxBuilderName = null;
		int maxRevenue = 0;
		for (Assignment39_builder builder : listOfBuilder) {
			if (builder.getRevenue() > maxRevenue) {
				maxRevenue = builder.getRevenue();
				maxBuilderName = builder;
			}
		}
		System.out.println("Builder Name having heighest revenue : " + maxBuilderName.getBuildName());
		System.out.println(maxBuilderName.getBuildName()+"'s reraNumber : " + maxBuilderName.getReraNumber());
		System.out.println(maxBuilderName.getBuildName()+"'s revenue : " + maxBuilderName.getRevenue());
	}
}