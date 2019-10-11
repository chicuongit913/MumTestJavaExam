package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MumTest9 {

	@Test
	void test() {

		assertEquals(0, isInertial(new int[] {1}));
		assertEquals(0, isInertial(new int[] {2}));
		assertEquals(0, isInertial(new int[] {1,2,3,4}));
		assertEquals(1, isInertial(new int[] {1, 1, 1, 1, 1, 1, 2}));
		assertEquals(1, isInertial(new int[] {2, 12, 4, 6, 8, 11}));
		assertEquals(1, isInertial(new int[] {2, 12, 12, 4, 6, 8, 11}));
		assertEquals(0, isInertial(new int[] {-2, -4, -6, -8, -11}));
		assertEquals(0, isInertial(new int[] {2, 3, 5, 7}));
		assertEquals(0, isInertial(new int[] {2, 4, 6, 8, 10}));
	}
	
	int isInertial(int[] a) {
		
		if (a == null || a.length == 0) {
			return 0;
		}
		
		int max = a[0];
		int[] odds = new int[a.length];
		int[] evens = new int[a.length];
		int oddIndex = 0, evenIndex = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(max < a[i])
				max = a[i];
			
			if(a[i] % 2 == 0)
			{
				evens[evenIndex] = a[i];
				evenIndex++;
			} else {
				odds[oddIndex] = a[i];
				oddIndex++;
			}
		}

		if(max % 2 != 0 || oddIndex == 0)
			return 0;
		
		for (int i = 0; i < oddIndex; i++) {
			for (int j = 0; j < evenIndex; j++) {
				if(odds[i] < evens[j] && evens[j] != max)
					return 0;
			}
		}
		
		return 1;
	}
}
