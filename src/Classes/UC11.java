package Classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class UC11 {

	@Test
	void test() {
		UC3 uc3 = new UC3();
		int check = uc3.email("abc.xyz@bl.co.in");
		assertEquals(1, check);
	}

}
