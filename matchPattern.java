package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest46 {

	@Test
	void test() {
		System.out.println(matchPattern(new int[]{1, 1, 1, 1, 1,2,3,4}, new int[] {1,2,3,4}));
	}
	static int matchPattern(int[] a, int[] pattern) {
		int k = 0; 
		int matches = 0; 
		int i = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == pattern[k])
				matches++;
			else if (matches == 0 || k == pattern.length-1)
				return 0;
			else {
				k++;
				i--;
			} 
		}
		
		if (i == a.length && k == pattern.length-1) 
			return 1; 
		else 
			return 0;
	}
}
