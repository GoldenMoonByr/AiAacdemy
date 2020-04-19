package ex;

public class MethodDefAdd {
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		hiEveryOne(21,175.4);
		hiEveryOne(10,185.1);
		hiEveryOne(23,178.8);
		hiEveryOne(20,170.7);
		hiEveryOne(21,175.5);
		

//		hiEveryOne(21);
//		hiEveryOne(19);
//		hiEveryOne(10);
//		hiEveryOne(30);
//		hiEveryOne(15);
//		hiEveryOne(19);
//		hiEveryOne(78);
//		hiEveryOne(26);
		// ctrl + k 키 눌려주고 마우스커서 올려주면 어디서 메서드가 정의 되었는지 볼 수 있다.

		System.out.println("프로그램 종료");

	}

	// 인사말 출력, 나이값을 받아서 나이를 출력하는 메서드
//	static void hiEveryOne(int age) {
//		System.out.println("안녕하세요 저는 이민수라고 합니다.");
//		System.out.println("제 나이는 "+age+"살 입니다.");

	static void hiEveryOne(int age, double height) {
		System.out.println("제 나이는" + age + "살 입니다.");
		if(age<15) {
			System.out.println("청소년 시기에는 정확한 신장 파악이 어렵습니다.");
			return ;
		}
		System.out.println("제 신장은" + height + "cm 입니다.");

	}
}
