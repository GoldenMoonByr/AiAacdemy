package op;

//3+6, 3+6+9 , 3+6+9+12의 연산 프로그램 작성.
public class HomeworkSol2 {
	public static void main(String[] args) {
		int a = 3;
		int sum = 3;
		for (int i = 2; i < 5; i++) {
			sum = sum + a*i;
			System.out.println(sum);
		}

	}

}
