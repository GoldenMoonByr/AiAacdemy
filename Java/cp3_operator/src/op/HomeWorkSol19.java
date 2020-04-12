package op;

import java.util.Scanner;

/* 
    최대값 , 최솟값 찾기
 */
class HomeWorkSol19 {
	public static void main(String[] args) {
		int num = 0;
		int min, max = 0;
		Scanner s = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		min = max = s.nextInt();

		for (int i = 0; i <4 ; i++) {
			num=d.nextInt();
			if(num>max) {
				max=num;
			}
			else if(num<min) {
				min=num;
			}
			
		}
		System.out.println("최솟값:"+min);
		System.out.println("최댓값:"+max);
	}

}
