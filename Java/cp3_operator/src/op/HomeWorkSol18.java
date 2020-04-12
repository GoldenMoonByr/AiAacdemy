package op;

/* 
    5. 세 수중 가장 큰 수 찾기 – 두 가지 방법 
 */
class HomeWorkSol18 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 2;
		int num3 = -3;
		int max = 0;

		if (num1 - num2 >= 0) {
			max = num1;
			if (max >= num3) {

				System.out.println(max + "(이)가 가장 큰 수입니다.");
			} else {
				System.out.println(num3 + "(이)가 가장 큰 수 입니다.");
			}

		} else if (num1 <= num2) {
			max = num2;
			if (max >= num3) {
				System.out.println(max + "(이)가 가장 큰 수 입니다.");
			} else {
				System.out.println(num3 + "(이)가 가장 큰 수 입니다.");
			}
		}
		

	}

}
