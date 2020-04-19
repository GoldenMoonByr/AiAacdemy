package fruit;

public class FruitMain {

	public static void main(String[] args) {

		
		//셀러 생성 : 인스턴스 화
		FruitSeller seller = new FruitSeller();
		// new FruitSeller() => 객체 생성, 메모리에 변수와 주소값 만들어준다.
		
		//구매자 생성 : 인스턴스 화
		FruitBuyer buyer = new FruitBuyer();
		
		//바이어가 사과를 구매
		buyer.buyApple(seller, 5000);
		
		System.out.println("판매 정보 출력");
		System.out.println("현재 사과의 개수" +seller.numOfApple);
		System.out.println("판매 금액 :"+seller.myMoney);
		System.out.println("-----------------------------------------");
		System.out.println("구매자 정보 출력");
		System.out.println("구매한 사과의 개수"+buyer.numOfApple);
		System.out.println("보유 금액"+buyer.myMoney);
		
		
		
	}

}
