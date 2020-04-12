package op;

//증감연산자 ++i와 i++.
public class OpEx01 {
	public static void main(String args[]) {
		int i = 5;

		System.out.println(i++); //i=i+1. 선출력, 후연산!

		++i;
		System.out.println(i); //화면 출력시 7로 2가 증가 한 것 처럼 보인다.

	}

}
