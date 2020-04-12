package op;
//byte형의 표현 범위 초과
public class OpEx09 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte) (a * b);
		//byte형은 -128~byte~128까지의 표현 범위를 갖고
		//표현 범위에서 초과되는 결과값을 갖으므로 값은 초과되어
		//표현 범위 안에서 머문다.
		System.out.println(c);
	}

}
