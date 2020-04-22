package Ex;
//1~100까지의 숫자를 출력하고 , 100~1까지의 숫자를 출력하라.
//while , do-while 문 한 번씩 사용하기.
public class Ex07 {
	public static void main(String[] args) {
		int num = 1;
		while (num <= 100) {
			System.out.print(num + "\t");
			num++;
		}
		num = 100;
		do {
			System.out.print(num + "\t");
			num--;
		} while (num >= 1);
	}

}
