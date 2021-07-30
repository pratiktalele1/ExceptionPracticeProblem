package Classes;
import static org.junit.jupiter.api.Assertions.assertEquals;

class invalidUserDetails extends Exception{
	public invalidUserDetails(String str) {
	
	}
}

public class UC12 {
	//validating user details
	public void validUserDetail()  throws invalidUserDetails {
		try {
			int count=0;
			UC1 uc1=new UC1();
			UC2 uc2=new UC2();
			UC3 uc3=new UC3();
			UC4 uc4=new UC4();
			UC9 uc9=new UC9();
			
			int check=uc1.firstName("Pratik");
			if(check ==1) {
				count++;
			}
			
			check=uc2.lastName("Talele");
			
			if(check ==1) {
				count++;
			}
			
			check=uc3.email("abc.xyz@bl.co.in");
			
			if(check ==1) {
				count++;
			}
			
			check=uc4.phoneNumber("91 8421863149");
			
			if(check ==1) {
				count++;
			}
			
			check=uc9.password("*aaaaaa");
			
			if(check ==1) {
				count++;
			}
			
			if(count==5) {
				System.out.println("Entry Successfully");
			}else {
				throw new invalidUserDetails("info not valid");
			}
			
		}catch (Exception e) {
			System.out.println("exception found :: " +e);
		}
}
}
