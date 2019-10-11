package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Year;

import org.junit.jupiter.api.Test;

class MumTest16 {

	@Test
	void test() {
		assertArrayEquals(new int[] {0, 0}, solve(10));
		
		
	}
	
	static int[] solve(int n){
		int tenFactorial = caculateFactorial(n);

		boolean factorialFound = false;
		int x = 1;
		int y = 1;
		for(x = 1; x < 10; x++){
			int xFactorial = caculateFactorial(x);
			
			for (y = x; y < 10; y++) {
				int yFactorial = caculateFactorial(y);
				
				if((xFactorial + yFactorial) == tenFactorial) {
					factorialFound = true;
					break;
				}
			}
			if(factorialFound)
				break;
		}
		
		if(x == 10 && y == 10) {
			x = 0;
			y = 0;
		}
	
		return new int[] {x,y};
	}
	
	static int caculateFactorial(int n) {
		
		if (n <= 0) {
			return 0;
		}
		
		int nFactorial = 1;
		for (int i = 1; i <=n; i++) {
			nFactorial = nFactorial * i; 
		}
		
		return nFactorial;
	}

}
