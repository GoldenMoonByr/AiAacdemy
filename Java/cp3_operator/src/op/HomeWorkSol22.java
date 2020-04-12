package op;

import java.util.Scanner;

/* 
	9. 특정 숫자 까지의 3의배수 합 구하기
 */
class HomeWorkSol22 {
	
	public static void main(String[] args) {
		int num,sum = 0;
		Scanner g =new Scanner(System.in);
		num = g.nextInt();
		for(int i=1 ; i<=num ; i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		
	System.out.println(sum);	
		
		
	}


}
