/*Dev by ouahidi*/
package Mokito_Spring_Boot_UnitTest_TP1;

import org.springframework.stereotype.Component;

@Component
	public class TP1_unitTest {
		public static int sum(int[] numbers) {
			int sum = 0;
			for (int i : numbers) {
				sum += i;
			}
			return sum;
		}
		public static int Multiplication(int a, int b) {
			int sum; 
            sum=a*b;
			return sum;
		}
	}
