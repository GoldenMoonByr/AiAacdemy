package op;

/* 
   두 변수 값 교환하기
 */
class HomeWorkSol20 {
	public static void main(String[] args) {
		int a=10; //a의 값 설정
		int b=20; //b의 값 설정
		int c=0; 
		c=a; //대입 연산자를 통해 a의 값을 c에 대입
		a=b; //b의 값을 a의 값에 대입 a의 값은 b의 값으로 바뀜
		b=c; //c에 있던 a의 값을 b에 대입.
		System.out.println("a의 값:"+a);
		System.out.println("b의 값:"+b);
	}

}
