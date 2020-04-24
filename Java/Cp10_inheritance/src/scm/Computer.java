package scm;

public class Computer extends Product {
	Computer(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "Computer";
	}
	
	void programming() {
		System.out.println("코딩을 시작합니다.");
	}

}
