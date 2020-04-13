package op;

/* 
    5. 세 수중 가장 큰 수 찾기 – 두 가지 방법 
 */
class HomeWorkSol18 {
	public static void main(String[] args) {
		int num1 = 89;
		int num2 = 99;
		int num3 = -3;
		int max = 0;
		max = num1;
		if (num1 < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println("1: "+num1+ "\t 2:"+num2+ "\t 3:" +num3+"\t가장 큰 수 :"+max);
	}

}
