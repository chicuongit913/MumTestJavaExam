package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest18 {

	@Test
	void test() {
		assertEquals(1, isCentered15(new int[] {3, 2, 10, 15, 1, 6, 9}));
		assertEquals(0, isCentered15(new int[] {2, 10, 4, 1, 6, 9}));
		assertEquals(0, isCentered15(new int[] {3, 2, 10, 4, 1, 6}));
		assertEquals(1, isCentered15(new int[] {1,1,8, 3, 1, 1}));
		assertEquals(1, isCentered15(new int[] {9, 15, 6}));
		assertEquals(0, isCentered15(new int[] {1, 1, 2, 2, 1, 1}));
		assertEquals(1, isCentered15(new int[] {3, 12, 15, 2, 4}));
	}

	
	int isCentered15(int[ ] a) {
		if(a == null || a.length == 0)
			return 0;
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = a[i];
			
			if(sum == 15 && isCenterArray(i+1, i+1, a.length))
				return 1;
			
			if (sum > 15) {
				continue;
			}
			
			for (int j = i+1; j < a.length; j++) {
				sum +=a[j];
				if(sum == 15 && isCenterArray(i+1, j+1, a.length))
					return 1;
				if (sum > 15) {
					break;
				}
			}
		}
		return 0;
	}
	
	boolean isCenterArray(int start, int end, int length) {
		int left = start-1;
		int right = length - end;
		if(left == right) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
