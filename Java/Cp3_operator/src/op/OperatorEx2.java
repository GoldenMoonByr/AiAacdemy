package op;

public class OperatorEx2 {

	public static void main(String[] args) {
			int i=5;
			
			int j=0;
			
			j = i++;   //j=5 i=6   j = i , i= i+1
			
			System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
			i=5;
			// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
			j=0;
			j = ++i; //i=6, j=6  i = i +1 , j = i
			System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);

	}

}
