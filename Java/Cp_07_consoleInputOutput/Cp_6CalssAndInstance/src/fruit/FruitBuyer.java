package fruit;

public class FruitBuyer {
	//속성 => 변수
	//		보유한 나의 돈
	
	//		사과의 개수
	
//	int myMoney = 10000;
//	int numOfApple = 0;

	
//	작성자 : 이민수 
//	수정일 : 2020.04-17
//	수정내용 : 생성자로 변수 초기화
	
	 //변수의 명시적 초기화 변경
	int myMoney;
	int numOfApple;
	
	//생성자
	FruitBuyer(){
		myMoney = 5000;
		numOfApple = 0;
	}
	
	FruitBuyer(int money , int num){
		myMoney=money;
		numOfApple=num;
	}
	
	// 구매 기능 : 메소드
	//		1. 셀러 찾기 , 셀러 받기.
	//		2. 지출할 돈 정의
	//		3. 셀러에게 돈을 주고 판매 요청
	//			->사과의 개수
	//		4.사과의 개수를 받은 사과 개수만큼 증가
	//		5.지출한 돈만큼 나의 돈에서 차감한다.
	//		반환할 값이 없다 -> void
	
	//참조변수 : 해당 타입의 주소값을 정의하는 변수
	void buyApple(FruitSeller seller, int money) {
		
		int num = seller.saleApple(money);
		numOfApple+=num;
		myMoney-=money;
		
	}
	
	
	
	
	
	
	
	
	
	

	
	
}
