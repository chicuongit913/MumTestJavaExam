package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class largestDifferenceOfEvens {

	@Test
	void test() {
		System.out.println(largestDifferenceOfEvens(new int[] {7, 3, 4, 9, 11,8}));
	}
	
	int largestDifferenceOfEvens(int[ ] a) {
		if (a.length < 2) {
			return -1;
		}
		int largest = -1;
		boolean exist2Event = false;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] % 2 == 0) {
				for (int j = i+1; j < a.length; j++) {
					if(a[j] %2 == 0) {
						int distanceEven = (a[j] - a[i] > a[i] -  a[j])?a[j] - a[i]:a[i] -  a[j];
						if(exist2Event == false || (exist2Event == true && largest < distanceEven)) {
							largest = distanceEven;
						}
						exist2Event = true;
					}
				}
			}
		}
		return largest;
	}

}
