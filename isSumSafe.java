package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest25 {

	@Test
	void test() {
		assertEquals(1,isSumSafe(new int[] {5, -2, 1}));
		assertEquals(0,isSumSafe(new int[] {5, -5, 0}));
		assertEquals(1,isSumSafe(new int[] {}));
	}
	
	
	int isSumSafe(int[ ]a) {
		
		int sum = 0;
		for(int anA : a) {
			sum += anA;
		}
		
		if(isNInArray(sum, a))
			return 0;
		else
			return 1;
		
	}
	
	boolean isNInArray(int n, int[] a) {
		boolean isNInArray = false;
		for(int anA : a) {
			if(anA == n)
				isNInArray = true;
		}
		
		return isNInArray;
	}
}
