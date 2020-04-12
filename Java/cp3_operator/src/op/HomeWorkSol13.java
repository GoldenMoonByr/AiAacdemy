package op;

/* 
다음은 대문자를 소문자로 변경하는 코드인데,
문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
문자코드는 소문자가 대문자보다32만큼 더 크다.
예를들어 'A‘의 코드는65이고 ’a'의 코드는97이다. 
(1)~(2)에 알맞은 코드를 넣으시오.
 */
class HomeWorkSol13 {
	public static void main(String[] args) {
		
			char ch = 'z';

			char lowerCase = ch>=97? (char)(ch-32):ch;
			

			System.out.println("ch:"+ch);

			System.out.println("chto lowerCase:"+lowerCase);
			
	}
}
