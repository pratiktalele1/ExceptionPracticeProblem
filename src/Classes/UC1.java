package Classes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {
	// validating first name
	public int firstName(String str) {
		try {
			int flag = 0;
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{2}");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("valid First Name");
				return 1;
			} else {
				System.out.println("invalid First Name");
				return 0;
			}	
		}catch (Exception e) {
			System.out.println("Exception found ::"+e);
			return 0;
		}
		

	}
}
