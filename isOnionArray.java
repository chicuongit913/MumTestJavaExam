package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest53 {

	@Test
	void test() {
		 System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 12}));
	        System.out.println(isOnionArray(new int[]{1, 3, 9, 8}));
	}
	
	int isOnionArray(int[ ] a) {
		if (a.length < 2) {
			return 1;
		}
		
		int j = 0;
		int k = a.length-1;
		
		while (j < k) {
			
			if(a[j] + a[k] > 10 && j + k == a.length-1)
				return 0;
			
			j++;
			k--;
		}
		
		return 1;
	}
}
