
public final class ZDigit {
	public static String storeZDigit = "";
	
	public ZDigit(char input) {
		final int ascii = (int) input;
		if (ascii != 48 && (ascii < 65 || ascii > 90)) {
			    throw (new IllegalArgumentException("Please enter a ZDigit only (0, A-Z)!"));
		} else {
			storeZDigit = storeZDigit + input;
		}
	}
}
