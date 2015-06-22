public final class Zdigit {
	public Zdigit(char input){
		int ascii = (int) input;  
		if (ascii != 48 && (ascii < 65 || ascii > 90)) {
			    throw (new IllegalArgumentException("Please enter a ZDigit only (0, A-Z)!"));
		}
	}
}
