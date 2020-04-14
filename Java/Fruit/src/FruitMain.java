
public class FruitMain {
	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer();
		FruitSeller seller = new FruitSeller();
		buyer.appleBuyingSystem(5000, seller);
		
		System.out.println("판매자 판매현황판");
		System.out.println("수입 : "+seller.income);
		System.out.println("남은 사과 개수"+seller.numOfApple);
		System.out.println("-----------------------------------");
		System.out.println("구입자 구매현황판");
		System.out.println("구입한 사과 개수"+buyer.myApple);
		System.out.println("남은 돈 :" +buyer.myMoney);
	}

}
