
public class FruitSeller {
	// 돈을 받아.
	// 돈에 부흥하는 개수만큼을 알아야 하고
	// 그 개수만큼 줘. (반환값)
	// 원래 갖고 있던 개수에서 그만큼의 개수를 빼
	// 내 수입을 알아본다.

	final int price = 1000;
	int numOfApple = 15;
	int income = 0;

	int amountOfApple(int money) {
		int num = money / price;
		numOfApple = numOfApple - num;
		income = income + money;
		return num;
	}
}
