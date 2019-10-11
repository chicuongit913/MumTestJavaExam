package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest29 {

	@Test
	void test() {
		assertEquals(15, countRepresentations(12));
	}

	
	int countRepresentations(int numRupees) {
		int count = 0;
		int sumRupees1 = 0, sumRupees2 = 0, sumRupees5 = 0, sumRupees10 = 0, sumRupees20 = 0;
		for (int rupee20=0; rupee20<=numRupees; rupee20++) {
			sumRupees10 = rupee20 * 20;
			if(sumRupees10 > numRupees)
				break;
			for (int rupee10=0; rupee10<=numRupees; rupee10++) {
				sumRupees10 = rupee20 * 20 + rupee10 * 10;
				if(sumRupees10 > numRupees)
					break;
				
				for (int rupee5=0; rupee5<=numRupees; rupee5++) {
					sumRupees5 = rupee20 * 20 + rupee10 * 10 + rupee5 * 5;
					if(sumRupees5 > numRupees)
						break;
					
					for (int rupee2=0; rupee2<=numRupees; rupee2++) {
						sumRupees2 = rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2;
						if(sumRupees2 > numRupees)
							break;
						
						for (int rupee1=0; rupee1<=numRupees; rupee1++) {
							sumRupees1 = rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2 + rupee1;
							if(sumRupees1 == numRupees) {
								count++;
							}
							
							System.out.println("----------------------");
							System.out.println(Arrays.toString(new int[] {rupee20, rupee10, rupee5, rupee2, rupee1}));
							System.out.println("++++++++++++++++++++++");
							
							if(sumRupees1 > numRupees)
								break;
						}
					}
				}
			}
		}
		return count;
	}
}
