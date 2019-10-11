package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sun.tools.jar.resources.jar;

class MumTest7 {

	@Test
	void test() {
		assertEquals(1, isMadhavArray(new int[] {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
		assertEquals(1, isMadhavArray(new int[] {2, 1, 1}));
		assertEquals(1, isMadhavArray(new int[] {2, 1, 1, 4, -1, -1}));
		assertEquals(0, isMadhavArray(new int[] {18, 9, 10, 6, 6, 6}));
		assertEquals(0, isMadhavArray(new int[] {-6, -3, -3, 8, -5, -4}));
		assertEquals(1, isMadhavArray(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, - 1}));
		assertEquals(1, isMadhavArray(new int[] {3, 1, 2, 3, 0, 0}));
	}
	
	int isMadhavArray(int[ ] a) {
		if(a.length < 3 )
			return 0;

		int i = 1, counter = 2;
		while (i < a.length) {
			
			int sum = 0;
		
			for (int j = 0; j < counter; j++, i++) {
				
				sum +=a[i];
			}

			if(sum != a[0])
				return 0;
			System.out.println("--------");
			System.out.println(i);
			System.out.println(counter);
			System.out.println("--------");
			if(i == a.length)
			{
				System.out.println("----++++---");
				if(counter*(counter+1)/2 == a.length)
					return 1;
			}	
			else {
				counter++;
				if((i+counter) > a.length)
					return 0;
			}
		}
		return 1;
	}
}
