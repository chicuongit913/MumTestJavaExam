package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest17 {

	@Test
	void test() {
		assertEquals(1, repsEqual(new int[] {3, 2, 0, 5, 3}, 32053));
		assertEquals(0, repsEqual(new int[] {3, 2, 0, 5}, 32053));
		assertEquals(0, repsEqual(new int[] {3, 2, 0, 5, 3, 4}, 32053));
		assertEquals(0, repsEqual(new int[] {2, 3, 0, 5, 3}, 32053));
		assertEquals(0, repsEqual(new int[] {9, 3, 1, 1, 2}, 32053));
		assertEquals(1, repsEqual(new int[] {0, 3, 2, 0, 5, 3}, 32053));
	}
	
	int repsEqual(int[ ] a, int n) {
		if(a == null || a.length == 0) {
			return 0;
		}
		
		for (int i = a.length - 1; i >= 0; i--) {
			int rem = n%10;
			
			if(a[i] != rem)
				return 0;
			
			n /=10;
		}
		
		if (n != 0) 
			return 0;
        else
            return 1;
	}

}
