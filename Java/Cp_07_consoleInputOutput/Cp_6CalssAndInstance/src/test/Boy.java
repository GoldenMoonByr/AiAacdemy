package test;

//import card.Card;

public class Boy {

	// Card c = new Card();

	// 구슬의 개수
	int numOfMarble;

	Boy(int num) {
		numOfMarble = num;
	}

	// 구슬의 개수 설정
	void setMarble(int num) {
		numOfMarble = num;
	}

	void gameWin(Boy boy, int num) {
		numOfMarble += num;
		boy.numOfMarble -= num;
	}

	void showDate() {
		System.out.println("현재 보유한 구슬의 개수는 " + numOfMarble);
	}

	public static void main(String[] args) {
		// 철수 생성
		Boy b1 = new Boy(15);
		// Boy b1 = new Boy();
		Boy b2 = new Boy(9);
		// Boy b2 = new Boy();
		// 철수는 구슬을 15개 보유, 영희는 구슬을 9개 보유
//		b1.setMarble(15);
//		b2.setMarble(9);
		System.out.println("철수는 구슬을 " + b1.numOfMarble + "개 보유 , 영희는 구슬을 " + " " + b2.numOfMarble + "개 보유.");
		System.out.println("------------------------------------------------");
		// 1차 게임에서 어린이 1은 어린이 2의 구슬 횓윽한다.
		System.out.println("1차 게임에서 철수는 영희의 구슬 2개를 획득한다");
		b1.gameWin(b2, 2);

		System.out.println("철수");
		b1.showDate();
		System.out.println("영희");
		b2.showDate();
		System.out.println("------------------------------------------------");

		// System.out.println("철수는 구슬을 " +b1.numOfMarble+"개 보유 , 영희는 구슬을 "
		// + " " + b2.numOfMarble+"개 보유.");

		// 2차 게임에서 영희가 철수의 구슬 7개를 획득한다.
		System.out.println("차 게임에서 영희가 철수의 구슬 7개를 획득한다.");
		b2.gameWin(b1, 7);
		System.out.println("철수");
		b1.showDate();
		System.out.println("영희");
		b2.showDate();

	}

}
