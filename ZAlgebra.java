
public class ZAlgebra {
	public static void main(String[] args){
		Zdigit zd = new Zdigit('0');
		ZNumber zn = new ZNumber('A','B','C','D');
		zn.toDecimal();
		ZNumber zn1 = new ZNumber("ABCDE");
		zn1.toDecimal();
	}
}
