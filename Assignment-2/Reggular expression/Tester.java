package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


	public class Tester {
	    public static boolean checkPasswordValidity(String password) {
	        String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#\\$%&\\*_])[A-Za-z0-9!@#\\$%&\\*_]{8,20}$";
	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(password);
	        return m.matches();
	    }

	    public static void main(String[] args) {
	        String password = "Test@1234";
	        boolean isValid = checkPasswordValidity(password);
	        if (isValid) {
	            System.out.println("Password is valid.");
	        } else {
	            System.out.println("Password is invalid.");
	        }
	    }
	}

