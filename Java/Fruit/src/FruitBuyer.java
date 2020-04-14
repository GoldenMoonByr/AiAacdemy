
public class FruitBuyer {
	// 누구한테 살 것인가? 지정해.
	// 얼마를 줄건지 입력해.
	// 사과를 받아.
	// 내 소득에서 가격만큼 뺴줘.

	int myMoney = 10000;
	int myApple = 0;

	void appleBuyingSystem(int money, FruitSeller seller) {
		int num = seller.amountOfApple(money);
		myApple += num;
		myMoney -= money;
	}

}
