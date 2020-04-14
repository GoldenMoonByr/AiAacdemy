package Ex;

//[4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
//몇까지 더해야 총합이 100이상이되는지 구하시오.
public class Ex19 {
	public static void main(String[] args) {

		int a = 0, sum = 0;
		while (true) {
			if (a % 2 == 0) {
				sum = sum - a;
			} else {
				sum = sum + a;
			}
			if (sum >= 100) {
				break;
			}
			a++;
		}
		System.out.println(a);
	}

}