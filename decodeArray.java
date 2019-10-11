package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sun.tools.jar.resources.jar;

class MumTest49 {

	@Test
	void test() {
		System.out.println(decodeArray(new int[]{2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
	}
	
	int decodeArray(int[ ] a) {
		if (a.length < 2) {
			return 0;
		}
		
		int sum = 0;
		for (int i = 0; i < a.length-1; i++) {
			int digit = Math.abs(a[i] - a[i+1]);
			
			int j = a.length-2;
			while (j > i) {
				digit *= 10;
				j--;
			}
			
			sum +=digit;
		}
		
		if(a[0] < 0)
			return -sum;
		else 
			return sum;
	}
}
