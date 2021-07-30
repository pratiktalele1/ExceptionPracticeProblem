package Classes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4 {
	// validating phone number
		public int phoneNumber(String str) {
			try {

				int flag = 0;
				Pattern pattern = Pattern.compile("^(\\+)?([ 0-9]){10,16}$");
				Matcher matcher = pattern.matcher(str);
				while (matcher.find()) {
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("valid phone number");
					return 1;
				} else {
					System.out.println("invalid phone number");
					return 0;
				}
			}catch (Exception e) {
				System.out.println("exception found :: "+e);
				return 0;
			}

		}
}
