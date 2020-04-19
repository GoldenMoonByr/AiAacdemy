package card;

public class CarMain {
	
	public static void main(String[] args) {
		
		//인스턴스 생성
		//Card c1 = new	Card();
		//c1.kind = "Heart";
		//c1.num = 7;
		Card c1 = new Card("Heart",7);
		
		//인스턴스 생성
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number= 4;
		
		System.out.println("첫번쨰 카드는" + c1.kind+" "+c1.number+"카드의 높이는"+c1.height+ "너비는" +c1.width);
		System.out.println("첫번쨰 카드는" + c2.kind+" "+c2.number+"카드의 높이는"+c2.height+ "너비는" +c2.width);
		
		
		System.out.println("카드의 사이즈를 변경합니다.");
		
		Card.height=125;
		Card.width=50;
		
		System.out.println("첫번쨰 카드는" + c1.kind+" "+c1.number+"카드의 높이는"+c1.height+ "너비는" +c1.width);
		System.out.println("첫번쨰 카드는" + c2.kind+" "+c2.number+"카드의 높이는"+c2.height+ "너비는" +c2.width);
		
	}

}
