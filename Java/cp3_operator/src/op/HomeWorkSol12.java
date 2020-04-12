package op;

/* 
다음은 문자형 변수ch가 영문자(대문자 또는 소문자)이거나 
숫자일 때만 변수b의 값이true가 되도록 하는 코드이다.
(1)에 알맞은 코드를 넣으시오.
 */
class HomeWorkSol12 {
	public static void main(String[]args) {
		


			char ch = 'a';
			//비교 연산자와 논리 연산자의 사용!
			boolean b = (ch>=97&&ch<=122) || (ch>=65&&ch<=90)||(ch>48&&ch<=57)? true : false;
			
			System.out.println(b);

			
			
		}
}
