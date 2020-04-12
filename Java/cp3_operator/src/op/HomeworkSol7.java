package op;

// 아래는 변수num의 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num 의 값이‘456’이라면 ‘400’이 되고,‘111’이라면 ‘100’이 된다.
//(1)에 알맞은 코드를 넣으시오. 
public class HomeworkSol7 {
	public static void main(String[] args) {

		int num = 456;

		System.out.println((num / 100) * 100); //int형은 소수점을 표현할 수 없으므로 값이 버려진다. 
											   //100 나누어 4.56의 정수형인 4를 만들고 100을 곱해줬다.
	}

}

