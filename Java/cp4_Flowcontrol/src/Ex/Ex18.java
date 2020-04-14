package Ex;

//[3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
public class Ex18 {
	public static void main(String[] args) {
		int a = 0, sum = 0, total = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			total = total + sum;
		}
		System.out.println(total);
	}
}
