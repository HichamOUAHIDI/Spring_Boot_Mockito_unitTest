/*Dev by ouahidi*/
package Mokito_Spring_Boot_UnitTest_TP1;
public class BusinessService {
	private DataService dataService;

	public BusinessService(DataService dataService) {
		this.dataService = dataService;
	}
 
	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
