package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest20 {

	@Test
	void test() {
		assertEquals(1, isNUnique(new int[] {7, 3, 3, 2, 4}, 11));
		assertEquals(0, isNUnique(new int[] {7, 3, 3, 2, 4}, 10));
		assertEquals(0, isNUnique(new int[] {7, 3, 3, 2, 4}, 6));
		assertEquals(0, isNUnique(new int[] {7, 3, 3, 2, 4}, 8));
		assertEquals(0, isNUnique(new int[] {7, 3, 3, 2, 4}, 4));
		assertEquals(1, isNUnique(new int[] {7, 3, 2, 4}, 5));
	}
	
	int isNUnique(int[ ] a, int n) {
		if(a == null && a.length < 2)
			return 0;
		
		int nUnique = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] + a[j] == n)
					nUnique++;
			}
		}
		
		if (nUnique == 1) {
			return 1;
		} else {
			return 0;
		}
	}
}
