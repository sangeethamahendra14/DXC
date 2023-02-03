package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shipment {
		  private static final String PRODUCT_NAME_PATTERN = "^[a-zA-Z]{2,}(\\s[a-zA-Z]{2,}){1,2}$";
		  private static final String PRODUCT_ID_PATTERN = "^[a-zA-Z0-9]{2,20}$";
		  private static final String TRACKER_ID_PATTERN = "^[A-Z]{1}:([A-Z]{4}:){2}[a-z]{3}:[0-9]{2}$";

		  public static boolean checkProductNameValidity(String productName) {
		    Pattern pattern = Pattern.compile(PRODUCT_NAME_PATTERN);
		    Matcher matcher = pattern.matcher(productName);
		    return matcher.matches();
		  }

		  public static boolean checkProductIdValidity(String productId) {
		    Pattern pattern = Pattern.compile(PRODUCT_ID_PATTERN);
		    Matcher matcher = pattern.matcher(productId);
		    return matcher.matches();
		  }

		  public static boolean checkTrackerIdValidity(String trackerId) {
		    Pattern pattern = Pattern.compile(TRACKER_ID_PATTERN);
		    Matcher matcher = pattern.matcher(trackerId);
		    return matcher.matches();
		  }
		}

		public class Tester {
		  public static void main(String[] args) {
		    String productName = "Product Name";
		    String productId = "PID123";
		    String trackerId = "A:ABCD:efg:12";

		    System.out.println("Product Name Validity: " + Shipment.checkProductNameValidity(productName));
		    System.out.println("Product Id Validity: " + Shipment.checkProductIdValidity(productId));
		    System.out.println("Tracker Id Validity: " + Shipment.checkTrackerIdValidity(trackerId));
		  }
		}

