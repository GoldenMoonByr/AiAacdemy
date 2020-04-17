package fruit;

// 수정 : 이민수
// 수정 날짜 : 2020-04-27
// 수정 내용 : 생성자를 통한 변수 초기화 , 현재 데이터 출력 메서드 생성(showResult()).


public class FruitSeller {

	// 속성 => 변수
	// 사과의 개수
	// 수입
	// 사과의 가격
	// 멤버 변수 ,인스턴스 변수
	//수정 : 변수의 명시적 초기화 변경
	
	
//	int numOfApple = 20; // 사과의 개수
//	int myMoney = 0; // 수입
//	final int PRICE = 2000; // 사과의 가격

	//수정 : 변수의 명시적 초기화 변경
	int numOfApple ; // 사과의 개수
	int myMoney ; // 수입
	final int APPLE_PRICE;; // 사과의 가격

	//생성자
	FruitSeller() {
		//numOfApple = 20;
		//myMoney = 0;
		//APPLE_PRICE = 1000;
		this(20,0,1000);
	}
	
	FruitSeller (int price){
		this(20,0,price);
		
	}
	
	FruitSeller(int numoOfApple , int myMoney , int price){
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = price;
	}
	
	// 판매 기능 => 메소드
	// 1. 돈을 받는다. --> 매개변수 int money
	// 2. 받은 돈의 사과의 개수를 구한다.
	// 3. 나의 사과 개수에서 반환해야하는 사과 개수를 빼준다.
	// 4. 받은 금액은 나의 수입으로 더해준다.
	// 5. 사과의 개수를 반환한다.
	// -->반환 데이터 int return 사과의 개수
	int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple = numOfApple - num; // numOfApple-=num
		myMoney = myMoney + money;// myMoney+=money
		return num;
	}
	
	void showResult() {
		System.out.println("현재 보유 금액 : "+myMoney+"이고, 현재 보유한 사과의 개수는"+numOfApple+"개 입니다.");
	}

}
