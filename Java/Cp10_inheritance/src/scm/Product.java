package scm;

// 상품 객체들의 상위클래스
public class Product {

	// 클래스는 대문자 , 변수,메소드는 소문자 시작.
	// 명명은 최대한 목적에 맞게 직관적으로.
	final int price; // 제품의 가격
	final int bonusPoint; // 제품의 포인트

	Product(int price) {
		this.price = price;
		this.bonusPoint = this.price / 10;
	}

}
