package friend;

public class FriendMain {

	public static void main(String[] args) {

		FriendInfoHandler handler = new FriendInfoHandler(20);

		while (true) {
			System.out.println("=========메뉴를 선택해주세요.=========");
			System.out.println("1. 고교 친구 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 친구 기본정보 출력");
			System.out.println("4. 친구 상세정보 출력");
			System.out.println("5. 종료");
			System.out.println("===============================");
			int choice = handler.kb.nextInt();
			handler.kb.nextLine(); // 앞의 버퍼 클리어

			switch (choice) {
			case 1:
			case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllSimpleData();
				break;
			case 4:
				handler.showAllData();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;

			}
		}
	}

}



