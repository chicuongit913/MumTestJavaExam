package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest61 {

	@Test
	void test() {
		System.out.println(isFibonacci(2));
	}
	
	int isFibonacci(int n) {
		if (n <= 1) {
			return 0;
		}
		
		int prev = 1;
		int next = 1;
		while (next < n) {
			int tempNext = next;
			next = prev + next;
			prev = tempNext;
		}
		
		if(next == n) {
			return 1;
		} else 
			return 0;
	}
}
