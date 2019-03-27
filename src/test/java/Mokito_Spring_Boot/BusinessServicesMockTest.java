/*Dev by ouahidi*/
package Mokito_Spring_Boot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
/*Dev by ouahidi*/

import Mokito_Spring_Boot_UnitTest_TP1.BusinessService;
import Mokito_Spring_Boot_UnitTest_TP1.DataService;
/*The JUnit Runner which causes all the initialization magic 
 * with @Mock and @InjectMocks to happen before the tests are run.*/
@RunWith(MockitoJUnitRunner.class)
	public class BusinessServicesMockTest {
		/*Create a mock for DataService*/
		@Mock
		DataService dataServiceMock;
		/*Inject the mocks as dependencies into BusinessService*/
		@InjectMocks
		BusinessService businessImpl;
        
		/* There are three test methods testing three different scenarios
		 *  - multiple values, 
		 *  - one value 
		 *  - no value passed in.*/
		@Test
		public void testFindTheGreatestFromAllData() {
			when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3,40 });
			assertEquals(40, businessImpl.findTheGreatestFromAllData());
		}

		@Test
		public void testFindTheGreatestFromAllData_ForOneValue() {
			when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
			assertEquals(15, businessImpl.findTheGreatestFromAllData());
		}

		@Test
		public void testFindTheGreatestFromAllData_NoValues() {
			when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
			assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
		}
	}