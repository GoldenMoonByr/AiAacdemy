package ex1;

//문자형 변수를 지정하고 해당하는 유니코드 값을 출력//

public class CastingOperation {

	public static void main(String[] args) {
		
		char c1='A'; //문자형 변수 지정
		
		char c2='Z'; //문자형 변수 지정
		
		int num1=c1; //c1이 int형으로 자연스럽게 형변환 된다.
		
		int num2=(int)c2; //c2에 해당하는 값을 int형으로 강제 형변환 됨을 나타낸다.
		
		System.out.println("\'A\'의 유니코드 값: "+num1);
		
		System.out.println("\'Z\'의 유니코드 값: "+num2);



	}

}
