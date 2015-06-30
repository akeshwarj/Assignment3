
public class ZAlgebra {
	public static void main(String[] args) {
		
		ZNumber zn1 = new ZNumber('A','B','C','D');
		zn1.toDecimal();
		
		ZNumber zn2 = new ZNumber("ABCDE");
		zn2.toDecimal();
		
		ZNumber zn3 = new ZNumber(new char[]{'P','Q','R','S'});
		zn3.toDecimal();
		
	}
}
