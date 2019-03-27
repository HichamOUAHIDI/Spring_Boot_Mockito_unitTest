/*Dev by ouahidi*/
package Mokito_Spring_Boot;

import static org.junit.Assert.assertEquals;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Mokito_Spring_Boot_UnitTest_TP1.TP1_unitTest;

public class UnitTest {
	
	TP1_unitTest M1=new TP1_unitTest();
	@org.junit.Before
	public void before() {
		System.out.println("Before");
	}
	@org.junit.After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		assertEquals(6, TP1_unitTest.sum(new int[] { 1, 2, 3 }));
	}
	@Test
	public void multiplication() {
		System.out.println("Test2");
		assertEquals(9, M1.Multiplication(3, 3));
	}
}
