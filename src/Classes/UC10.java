package Classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class UC10 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void happyCase() {
		try {

			int count = 0;
			UC1 uc1 = new UC1();
			UC2 uc2 = new UC2();
			UC3 uc3 = new UC3();
			UC4 uc4 = new UC4();
			UC9 uc9 = new UC9();

			int check = uc1.firstName("Pratik");
			assertEquals(1, check);
			if (check == 1) {
				count++;
			}

			check = uc2.lastName("Talele");
			assertEquals(1, check);
			if (check == 1) {
				count++;
			}

			check = uc3.email("abc.xyz@bl.co.in");
			assertEquals(1, check);
			if (check == 1) {
				count++;
			}

			check = uc4.phoneNumber("91 8421863149");
			assertEquals(1, check);
			if (check == 1) {
				count++;
			}

			check = uc9.password("A0*aaaaaa");
			assertEquals(1, check);
			if (check == 1) {
				count++;
			}

			if (count == 5) {
				System.out.println("Entry Successfully");
			}

		} catch (Exception e) {
			System.out.println("exception found ::" + e);
		}
	}

	@Test
	void sadCase() {
		try {
			int count = 0;
			UC1 uc1 = new UC1();
			UC2 uc2 = new UC2();
			UC3 uc3 = new UC3();
			UC4 uc4 = new UC4();
			UC9 uc9 = new UC9();

			int check = uc1.firstName("Pratik");
			assertEquals(0, check);
			if (check == 1) {
				count++;
			}

			check = uc2.lastName("Talele");
			assertEquals(0, check);
			if (check == 1) {
				count++;
			}

			check = uc3.email("abc.xyz@bl.co.in");
			assertEquals(0, check);
			if (check == 1) {
				count++;
			}

			check = uc4.phoneNumber("91 8421863149");
			assertEquals(0, check);
			if (check == 1) {
				count++;
			}

			check = uc9.password("A0*aaaaaa");
			assertEquals(0, check);
			if (check == 1) {
				count++;
			}

			if (count == 5) {
				System.out.println("Entry fails");
			}

		} catch (Exception e) {
			System.out.println("exception found ::" + e);
		}

	}

}
