package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest62 {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	int isMercurial(int a[ ], int len) {
		if (a.length < 3) {
			return 1;
		}
		
		for (int i = 0; i < a.length-2; i++) {
			if (a[i] == 1) {
				boolean occurN = false;
				for (int j = i+1; j < a.length; j++) {
					if (a[j] == 3) {
						occurN = true;
					}
					
					if(a[j] == 1 && occurN)
						return 0;
				}
			}
		}
		
		return 1;
	}
}
