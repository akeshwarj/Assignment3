
public final class ZNumber {
	private final String Znum;
	
	public ZNumber(char... Zdigits){		//CONSTRUCTOR NUMBER 1
		Znum = new String(Zdigits);
		System.out.println(Znum);
	}	
	
	public ZNumber(String Zdigits){			//CONSTRUCTOR NUMBER 2
		Znum = Zdigits;
	}
	
	
	
	@Override public String toString(){
		return Znum;
	}
	
	
	/*
			AB = 26*1 + 2 = 28
			A0 = 26
			ABCD = (26^3)*1+(26^2)*2+(26^1)*3+(26^0)*4=19010			
	*/
	//This function will convert the input to the string.
	public void toDecimal(){
		double sum =0;
		char[] array = Znum.toCharArray();
		double l = (double)array.length;
		for(int i=0; i<l; i++){
			double val = (double)(getvalue(array[i]));
			sum = sum + (Math.pow(26,(l-i-1)))*(val);
		}
		System.out.println("The decimal value is " + (int)sum);
	}
	
	
	//This function converts the input character to its value and returns it, i.e., A=1, B=2, ... Z=26
	private int getvalue(char zdigit){
		if(zdigit == '0')
			return 0;
		else{
			int ascii = (int)zdigit;
			//System.out.println(ascii - 64); Everything is fine here
			return (ascii - 64);
		}
	}
}
