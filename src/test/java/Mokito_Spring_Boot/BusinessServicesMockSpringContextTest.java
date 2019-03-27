/*Dev by ouahidi*/

package Mokito_Spring_Boot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import Mokito_Spring_Boot_UnitTest_TP1.BusinessService;
import Mokito_Spring_Boot_UnitTest_TP1.DataService;

/*code below shows how we can write 
 * the same unit test launching up the complete Spring context.*/

/*spring Runner is used to launch up a spring context in unit tests.*/
@RunWith(SpringRunner.class)

/*This annotation indicates that the context under test is a @SpringBootApplication.
 *  The complete MokitoSpringBootApplication is launched up during the unit test.*/
@SpringBootTest
public class BusinessServicesMockSpringContextTest {
	
	/*@MockBean annotation creates a mock for DataService.
	*This mock is used in the Spring Context instead of the real DataService.*/
	@MockBean
	DataService dataServiceMock;
	/*Pick the Business Service from the Spring Context and autowire it in.*/
	@Autowired
	BusinessService businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
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
