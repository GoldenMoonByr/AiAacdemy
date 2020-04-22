package op;

//소문자를 대문자로 바꾸는 예제 , 대문자도 반대로 적용해보자
public class OperatorEx16 {

	public static void main(String[] args) {

		char lowerCase = 'a';

		char upperCase = (char) (lowerCase - 32);

		System.out.println(upperCase);

	}

}
