package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassTester {
	    public static boolean checkWebAddressValidity(String webAddress) {
	        String pattern = "^(ttps?://)?(www\\.)?[a-zA-Z0-9]+\\.[com|org|net]+$";
	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(webAddress);
	        return m.matches();
	    }

	    public static void main(String[] args) {
	        String webAddress = "https://www.google.com";
	        boolean isValid = checkWebAddressValidity(webAddress);
	        if (isValid) {
	            System.out.println("Web address is valid.");
	        } else {
	            System.out.println("Web address is invalid.");
	        }
	    }
	}
	




