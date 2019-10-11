package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest34 {

	@Test
	void test() {
		assertEquals(1, isRailroadTie(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}

	
	int isRailroadTie(int[ ] a) {
		
		if(a.length < 2 || a == null)
			return 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				if(i == 0 || i == a.length-1 || a[i-1] == 0 || a[i+1] == 0)
				{
					System.out.println(Arrays.toString(new int[] {a[i], i}));
					return 0;
				}
					
			} else {
				if((i == 0 && a[i+1] == 0) || (i == a.length-1 && a[i-1] == 0) || (i > 0 && i < a.length-1 && a[i-1] == 0 && a[i+1] == 0))
				{
					System.out.println(Arrays.toString(new int[] {a[i], i}));
					return 0;
				}
			}
		}
		
		return 1;
	}
}
