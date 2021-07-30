package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC9 {
	// validating password
	public int password(String str) {
		try {

			int flag = 0;
			Pattern pattern = Pattern.compile("^([A-Z]{1,1}[0-9]{1}[_?&*$#@]{1}[a-zA-Z]{6})");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("valid password");
				return 1;
			} else {
				System.out.println("invalid password");
				return 0;
			}
		} catch (Exception e) {
			System.out.println("exception found :: " + e);
			return 0;
		}

	}
}
