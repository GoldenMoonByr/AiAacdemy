package op;

//a= {{(25+5)+(36/4)}-72}*5, b= {{(25x5)+(36-4)}-71}/4, c=(128/4)*2 일 때
//a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 작성
public class HomeworkSol4 {
	public static void main(String[] args) {
	
		int a = ( (25+5)+(36/4)-72 )*5;
		float b = (float)(25*5+36-4-71)/4;
		int c = 128/4*2;
		boolean d =true;
		System.out.println("a의 값:"+a);
		System.out.println("b의 값:"+b);
		System.out.println("c의 값:"+c);
		
		System.out.println("a>b>c가 참이면 true 거짓이면 false ");
		if (a>b && a>c && b>c) {
			System.out.println(d);
		}
		else
			System.out.println(!d);
		
	}

}
