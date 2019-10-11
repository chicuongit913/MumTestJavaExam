package mumTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MumTest21 {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	int isLegalNumber(int[ ] a, int base) {
		for (int anA : a) {
            if (anA < 0 || anA > base)
                return 0;
        }
        return 1;
	}
}
