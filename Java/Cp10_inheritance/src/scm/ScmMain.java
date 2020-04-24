package scm;

public class ScmMain {
	public static void main(String[] args) {
		// 상속 관계에서 다형성
		// 상위 클래스 타입의 참조 변수에 = 하위 클래스의 인스턴스
		Product p = new Tv(100);
		// System.out.println(p1);

//		Tv tv = new Tv(10);
//		Computer com = new Computer(20);
//		Audio audio = new Audio(30);

//		Product p1 = tv;
//		Product p2 = com;
//		Product p3 = audio;

		// 상위 클래스 타입의 배열 생성
		Product[] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(200);
		products[2] = new Audio(300);

		// products[0].display();
		// 명시적인 형변환 상위타입의 변수 -> 하위타입의 변수
		// instanceof 연산자 -> p1 instanceof compuer ==> true / false
		// 참조변수가 참조하는 인스턴스를 특성 클래스 타입으로 형변환이 가능한지 여부를 확인

		// 전달 하는 배열에 컴퓨터가 있다면 프로그랭을 하겠다.
		for (int i = 0; i < products.length; i++) {

			if (products[0] instanceof Computer) {
				((Computer) products[0]).programming();
			}

		}

		System.out.println("==========================");
		System.out.println("==========================");

		// ((Tv)products[0]).display();
		int sumOfPrice = 0;
		int sumOfPoint = 0;
//		for(int i =0 ; i<products.length;i++) {
//			System.out.println(products[i]);
//			sumOfPrice+=products[i].price;
//			sumOfPoint+=products[i].bonusPoint;
//		}
//		
//		System.out.println("전체 제품의 가격의 합은 : "+sumOfPrice);
//		System.out.println("전체 제품의 포인트 합은 : "+sumOfPoint);

		// int sum = tv.price + com.price + audio.price;

		// 구매자가 제품을 구매하는 시뮬레이션
		Buyer buyer1 = new Buyer();

		// 제품 생성
		Tv product1 = new Tv(200);
		Computer product2 = new Computer(250);
		Audio product3 = new Audio(100);

		// Tv 구매
		buyer1.buy(product1);
		// Computer 구매
		buyer1.buy(product2);
		// Audio 구매
		buyer1.buy(product3);
		// Computer 구매
		buyer1.buy(product2);

		buyer1.summary();

//		System.out.println("현재 보유금액 : " + buyer1.Money);
//		System.out.println("현재 보유 포인트 :" + buyer1.bonusPoint);

	}
}
