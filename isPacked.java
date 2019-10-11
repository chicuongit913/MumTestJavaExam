package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest36 {

	@Test
	void test() {
		assertEquals(1, isPacked(new int[] {2, 2, 1, 3, 3, 3, 4, 4, 4, 4}));
	}
	
	int isPacked(int[ ] a) {
		if(a.length == 0)
			return 1;
		
		if(a.length == 1 && a[0] == 1)
			return 1;
		
		if(a.length == 1 && a[0] != 1)
			return 0;
		
		int i = 0;
		while (i < a.length) {
			int countConsecutiveAppears = 1;
			int k = i+1;
			
			while (k < a.length && a[i] == a[k]) {
				countConsecutiveAppears++;
				k++;
			}
			System.out.println(countConsecutiveAppears);
			if(countConsecutiveAppears != a[i])
				return 0;
			
			i = k;
			
		}
		
		return 1;
	}
}
