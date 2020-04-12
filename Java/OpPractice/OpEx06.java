package op;
//~ÀÇ ¿ëµµ
public class OpEx06 {
	public static void main(String[] args) {
		byte b = 10;
		
		// byte result =~b;
		
		byte result = (byte) ~b;
		
		System.out.println("b = " + b);
		
		System.out.println("~b = " + result);
		
		result = (byte) ~(b+1);
		
		System.out.println("~(b+1)="+result);
	}

}
