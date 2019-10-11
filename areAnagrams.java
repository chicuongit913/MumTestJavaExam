package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MumTest60 {

	@Test
	void test() {
		areAnagrams(new char[] {'p','o','o','l','p'}, new char[] {'l','o','l','p','o'});
	}
	
	int areAnagrams(char [ ] a1, char [ ] a2) {
		
		int[] aTemp = new int[a2.length];
		int k = 0;
		
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a2.length; j++) {
					if (a1[i] == a2[j] && aTemp[j] == 0) {
						aTemp[j] = 1;
						k++;
						break;
					}
				}
			}
		}
		
		if (k == a1.length) {
			return 1;
		} else 
			return 0;
	}
}
