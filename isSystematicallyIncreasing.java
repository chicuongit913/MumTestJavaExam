package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest56 {

	@Test
	void test() {
		System.out.print(isSystematicallyIncreasing(new int[] {1,1 , 2 ,3}));
	}

	int isSystematicallyIncreasing(int[ ] a) {
		if (a.length == 0) {
			return 0;
		}
		
		int sequence = 1;
		for (int i = 0; i < a.length;) {
			if(a[i] != 1)
				return 0;
			int temp = sequence-1;
			i++;
			while (temp > 0) {
				if(a[i-1] != a[i] - 1)
					return 0;
				i++;
				temp--;
			}
			sequence++;
		}
		
		return 1;
	}
}
