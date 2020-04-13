package Ex;

//1 부터 99까지의 합을 구하는 프로그램 작성
//while문, for문, do while 문을 각각 사용
public class Ex16 {
	public static void main(String[] args) {
		int n = 1, sum = 0;
		for (int i = 1; i < 100; i++) {
			sum += i;  //sum=sum+i
		}
		System.out.println("for문 사용 :" + sum);
		sum = 0; //sum값 재사용을 위한 초기화
		while (n < 100) {
			sum += n;
			n++;
		}
		System.out.println("while문 사용 :" + sum);
		n = 1;   //n값 재사용을 위한 초기화
		sum = 0; //sum값 재사용을 위한 초기화
		do {
			sum += n;
			n++;
		} while (n < 100);
		System.out.println("do-while문 사용:" + sum);
	}
}
