package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest39 {

	@Test
	void test() {
		System.out.print(is121Array(new int[] {1,1, 1, 1, 1}));
	}
	
	int is121Array(int[ ] a)
	{
		if(a.length < 3)
			return 0;
		
		boolean is1 = false;
		boolean is2 = false;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 1) {
				is1 = true;
			} else if(a[i] == 2){
				is2 = true;
			} else {
				return 0;
			}
		}
		
		if(is1 && is2 && a[0] == a[a.length-1])
			return 1;
		
		return 0;
	}
}
