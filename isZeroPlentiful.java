package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest50 {

	@Test
	void test() {
		System.out.println(isZeroPlentiful(new int[] {1, 0, 0, 0, 2, 0, 0, 0, 0}));
//        System.out.println(isZeroPlentiful(new int[]));
	}

	int isZeroPlentiful(int[ ] a) {
		if (a.length < 4) {
			return 0;
		}
		int nSequence = 0;
	
		for (int i = 0; i < a.length; ) {
			if(a[i] == 0) {
				int k = i+1;
				while (k < a.length && a[i] == a[k]) {
					k++;
				}
				
				if(k - i > 3) {
					nSequence++;
					i = k;
				}
				else 
					return 0;
			} else 
				i++;
		}
		
		return nSequence;
	}
}
