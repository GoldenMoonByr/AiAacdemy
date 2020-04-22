package op;

/* 
	4. 두 수중 큰 수 찾기
 */
class HomeWorkSol16 {
	public static void main(String[] args) {
		int num1=-3;
		int num2=-2;
		if (num1-num2<0) {
			System.out.println(num2+"(가)이 더 큰 수 입니다.");
		}
		else if (num1-num2>0) {
			System.out.println(num1+"(가)이 더 큰 수 입니다.");
		}
		else
			System.out.println("두 수는 같은 수 입니다.");
	}
}
