package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5 {
	// validating password
	public void password(String str) {
		try {

			int flag = 0;
			Pattern pattern = Pattern.compile("^[a-zA-Z0-9-_.?]{8}");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("valid password");
			} else {
				System.out.println("invalid password");
			}
		} catch (Exception e) {
			System.out.println("exception found :: " + e);
		}

	}
}
