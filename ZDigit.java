
public final class ZDigit {
	public ZDigit(char input){
		final int ascii = (int) input;  
		if (ascii != 48 && (ascii < 65 || ascii > 90)) {
			    throw (new IllegalArgumentException("Please enter a ZDigit only (0, A-Z)!"));
		}
		else
			System.out.println(input);
	}
}
