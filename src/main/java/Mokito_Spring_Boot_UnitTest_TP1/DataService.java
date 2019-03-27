/*Dev by ouahidi*/
package Mokito_Spring_Boot_UnitTest_TP1;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
	public int[] retrieveAllData() {
		// Some dummy data
		// Actually this should talk to some database to get all the data
		return new int[] { 1, 2, 3, 4, 5 };
	}
}
