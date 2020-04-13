package ex;
//1부터 10까지의 합 for,while문 이용
public class Ex1 {
	public static void main(String[] args) {
		// 연산의 합을 담는 변수
		int sum = 0;
		
		 // 1~10까지의 합 // 반복 +1 씩
		for (int i = 1; i <= 10; i++) { sum = sum + i; }{
		System.out.println("1부터 10까지의 숫자의 합 : "+sum); }
		 
		sum=0;
		int i=1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1부터 10까지의 숫자의 합 : "+sum);

	}

}

