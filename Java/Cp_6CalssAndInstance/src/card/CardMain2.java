package card;

public class CardMain2 {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				String kind = "";

				switch (i) {
				case 0:
					kind = "spade";
					break;
				case 1:
					kind = "Clover";
					break;
				case 2:
					kind = "Heart";
					break;
				case 3:
					kind = "Diamond";
					break;
					
			
				}
				System.out.println("카드의 높이가"+Card.height+",너비가"+Card.width+"인"+kind+"모양의"+j+"번 째 카드를 뽑았습니다." );
			}
		}

	}

}
