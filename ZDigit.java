
public final class ZDigit {
	public static String storeZDigit = "";
	
	public ZDigit(char input) {
		if (input != '0' && (input < 'a' || input > 'z')) {
			    throw (new IllegalArgumentException("Please enter a ZDigit only (0, A-Z)!"));
		} else {
			storeZDigit = storeZDigit + input;
			System.out.println();
		}
	}
}
