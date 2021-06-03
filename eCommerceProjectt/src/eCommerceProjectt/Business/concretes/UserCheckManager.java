package eCommerceProjectt.Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager  {

	public static boolean emailChecker(String email) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
        	System.out.println("Doðru");
            return true;
        } else {
        	System.out.println("Yanlýþ");
            return false;
        }

    }
	
	
	
	
	
	
}