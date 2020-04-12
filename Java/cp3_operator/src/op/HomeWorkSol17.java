package op;

/* 
    짝수와 홀수 판별하기 
 */
class HomeWorkSol17 {
	public static void main(String[] args) {
		int num = 6;

		if (num == 0) {//숫자가 0일 경우 짝수로 표현되지 않게 먼저 범위로 지정.
			System.out.println("0입니다.");
		} else if (num%2==0){
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}

