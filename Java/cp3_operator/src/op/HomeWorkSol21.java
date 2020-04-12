package op;

/* 
	8. 작은 수에서 큰 수까지의 합 구하기
 */
class HomeWorkSol21 {
	public static void main(String[] args) {

		int num1, num2, sum =0;
		num1 = 6;
		num2 = 9;
		for(int i=num1;i<=num2;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
