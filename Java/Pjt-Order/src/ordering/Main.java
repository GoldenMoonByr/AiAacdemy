package ordering;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManagement manager = new AccountManagement();
		Item listManager = new Item();
		ArrayList<AccountInfo> InfoBooks = new ArrayList<>();
		AccountInfo account = null;
		OrderSystem order = new OrderSystem();

		while (true) {
			System.out.println("====================");
			System.out.println("1.거래처 선택");
			System.out.println("2.거래처 등록");
			System.out.println("3.거래처 검색");
			System.out.println("4.거래처 수정");
			System.out.println("5.거래처 삭제");
			System.out.println("6.거래처 목록");
			System.out.println("7.발주 관리");
			System.out.println("====================");
			int key = sc.nextInt();
			sc.nextLine();

			switch (key) {
			case 1:
				account = manager.accountSelect();
				if (account == null) {
					System.out.println("찾으시는 거래처 정보가 없습니다.");
					break;
				}

				int key2 = 0;
				int num = 0;
				while (true) {
					System.out.println("1.상품 전체 출력 2. 상품 추가 3. 상품 삭제 4.상품 수정 5. 거래처 나가기");
					key2 = sc.nextInt();
					if (key2 == 5)
						break;
					sc.nextLine();

					switch (key2) {
					case 1:
						account.showBasicData();
						System.out.println(account.getAccountName() + "에서 발주 하시겠습니까? Yes : 1 , No : 2");
						num = Integer.parseInt(sc.nextLine());
						if (num == 2) {
							break;
						} else if (num == 1) {
							order.orderItem(account);
							num = sc.nextInt();
							sc.nextLine();
							if (num == 1) {
								order.orderItem(account);
							} else if (num == 2) {
								break;
							}

						}

					case 2:
						System.out.println("[새 상품 정보를 입력해주세요]");
						Item newItem = new Item();
						System.out.println("[대분류] > ");
						newItem.setBigCategory(sc.nextLine());
						System.out.println("[중분류] > ");
						newItem.setMediCategory(sc.nextLine());
						System.out.println("[이름] > ");
						newItem.setName(sc.nextLine());
						System.out.println("[가격] > ");
						newItem.setPrice(sc.nextInt());
						System.out.println("[수량] > ");
						newItem.setCount(sc.nextInt());
						System.out.println("저장되었습니다!");
						sc.nextLine();
						account.addItem(newItem);
						break;

					case 3:
						System.out.println("[삭제할 상품 이름을 입력해주세요]>");
						account.deleteItem(sc.nextLine());
						break;
					case 4:
						System.out.println("[수정할 상품 이름을 입력해주세요]>");
						account.editItem(sc.nextLine());
						break;

					default:
						System.out.println("[잘못된 값입니다.]");
					}
				}
				continue;
			case 2:
				manager.addAccount();
				break;
			case 3:
				manager.searchAccountInfor();
				break;
			case 4:
				manager.accountInfoEdit();
				break;
			case 5:
				manager.deleteAccountInfor();
				break;
			case 6:
				manager.showAllAccountData();
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

				continue;
			}
		}
	}

}
