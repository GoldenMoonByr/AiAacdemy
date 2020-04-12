package op;
//int형의 표현 범위와 초과 됐을 시
public class OpEx10 {
	public static void main(String[] args) {
		
		int a = 1000000; // 1,000,000 1백만
		
		int b = 2000000; // 2,000,000 2백만
		
		int c = a * b; // 2,000,000,000,000
		//int 형의 표현 범위를 넘어섰다. long 형으로 변환해줘야 하며
		//long c = a * (long)b; 식으로 바꾸어줘야 한다.
		
		System.out.println(c);
	}

}
