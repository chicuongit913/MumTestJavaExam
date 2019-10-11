package mumTestPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest2 {

	@Test
	public void main() {
		int a1[] = {1};
		assertEquals(f(a1), 1);
		
		int f2[] = {1, 2};
		assertEquals(f(f2), -1);
		
		int f3[] = {1, 2, 3};
		assertEquals(f(f3), 2);
		
		int f4[] = {1, 2, 3, 4};
		assertEquals(f(f4), -2);
		
		int f5[] = {3, 3, 4, 4};
		assertEquals(f(f5), -2);
		
		int f6[] = {3, 2, 3, 4};
		assertEquals(f(f6), 0);
		
		int f7[] = {4, 1, 2, 3};
		assertEquals(f(f7), -2);
		
		int f8[] = {1, 1};
		assertEquals(f(f8), 2);
		
		int f9[] = {};
		assertEquals(f(f9), 0);
	}
	
	int f(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		
		int sumOdd = 0;
		int sumEven = 0;
		
		for (int i = 0; i < a.length; i++) {
			//even number
			if(a[i] % 2 == 0) {
				sumEven += a[i];
			} else { //odd number
				sumOdd += a[i];
			}
		}
		
		return sumOdd-sumEven;
	}

}
