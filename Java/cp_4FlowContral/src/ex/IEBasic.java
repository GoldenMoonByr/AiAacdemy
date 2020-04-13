package ex;

//if문의 기본 사용 예와, if-else문의 기본 사용 예.
public class IEBasic {
	public static void main(String[] args) {
		if (true) {
			System.out.println("true일때 출력");
		}
		if (false) {
			System.out.println("true 일때 출력");  //사실은 없어도 될 문장
		}
		if (true) {
			System.out.println("true 일때 출력");
		} else {
			System.out.println("false 일때 출력"); //사실은 없어도 될 문장
		}
		
		if(10>5) {
			System.out.println("10은 5보다 큽니다.");
		}
		
		int num = 10;
		if(num==5) {
			System.out.println("num은 5이다.");
		}
	}
}