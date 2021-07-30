package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3 {
	// validating email
	public int email(String str) {
		try {

			int flag = 0;
			Pattern pattern = Pattern.compile("^abc.[A-Za-z]+@bl.co");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("valid email");
				return 1;
			} else {
				System.out.println("invalid email");
				return 0;
			}

		} catch (Exception e) {
			System.out.println("exception found :: " + e);
			return 0;
		}
	}
}
