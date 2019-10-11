package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest41 {

	@Test
	void test() {
		System.out.println(largestAdjacentSum(new int[] {1, 2, 3, 4}));
		System.out.println(largestAdjacentSum(new int[] {18, -12, 9, -10}));
		System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,1,1,1,1}));
		System.out.println(largestAdjacentSum(new int[] {1,1,1,1,1,2,1,1,1}));
	}

	int largestAdjacentSum(int[ ] a) {
		if (a.length < 2) {
			return 0;
		}
		int largestSum = a[0] + a[1];
		
		for (int i = 1; i < a.length-1; i++) {
			if(largestSum < (a[i] + a[i+1]))
				largestSum = a[i] + a[i+1];
		}
		
		return largestSum;
	}
}
