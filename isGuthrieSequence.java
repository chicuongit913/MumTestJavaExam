package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest12 {

	@Test
	void test() {
		assertEquals(1, isGuthrieSequence(new int[] {8, 4, 2, 1}));
		assertEquals(0, isGuthrieSequence(new int[] {8, 17, 4, 1}));
		assertEquals(0, isGuthrieSequence(new int[] {8, 4, 1}));
		assertEquals(0, isGuthrieSequence(new int[] {8, 4, 2}));
	}
	
	int isGuthrieSequence(int[ ] a) {
		
		if(a == null || a.length < 1 || a[a.length-1] != 1)
			return 0;

		for (int i = 0; i < a.length-1; i++) {
			if(caculateNextGuthrieSequenceNumber(a[i]) != a[i+1])
				return 0;
		}
		
		return 1;
	}
	
	int caculateNextGuthrieSequenceNumber(int n) {
		if(n % 2 == 0) {
			return n/2;
		}
		else {
			return n*3+1;
		}
	}

}
