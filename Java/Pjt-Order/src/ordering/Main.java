package ordering;

import java.util.ArrayList;
import java.util.Scanner;

public class Main implements MenuNumInterface {

	public static void main(String[] args) {

		ExceptionClass exception = new ExceptionClass();
		SellerManagement manager = new SellerManagement();
		OrderSystem order = new OrderSystem();
		SellerInfo account = null;

		int key2 = 0;
		int num = 0;
		int key = 0;

		while (true) {
			MainMenu.menuList();
			try {
				key = exception.sc.nextInt();

			} catch (Exception e) {

				MainMenu.seperator();
				System.out.println("                    잘못된 입력입니다! 확인 후 다시 입력해주세요.                     ");
				MainMenu.seperator();
				continue;
			} finally {
				exception.sc.nextLine();
			}
			switch (key) {
			case A_SELECT:
				account = manager.selectAccount();
				if (account == null) {
					MainMenu.seperator();
					System.out.println("                          찾으시는 거래처 정보가 없습니다.");
					MainMenu.seperator();
					break;
				} else {
				}

				while (true) {
					try {
						System.out.println("[1] 상품 전체 출력  [2] 상품 추가  [3] 상품 삭제  [4] 상품 수정  [5] 이전 단계로 나가기");
						key2 = exception.sc.nextInt();
					} catch (Exception e) {
						MainMenu.seperator();
						System.out.println("                  잘못된 입력입니다! 확인 후 다시 입력해주세요.                     ");
						MainMenu.seperator();
						continue;
					} finally {
						exception.sc.nextLine();
					}

					if (key2 == I_EXIT)
						break;

					switch (key2) {
					case I_ORDER:
						order.orderItem(account);
						break;
					case I_ADD:
						account.itemManager.addItem();
						break;
					case I_DELETE:
						account.itemManager.deleteItem();
						break;
					case I_EDIT:
						account.itemManager.editItem();
						break;
					default:
						System.out.println("각 기능에 맞는 번호를 선택해주세요.");

					}
				}
				continue;
			case A_CREATE:
				manager.addAccount();
				break;
			case A_SEARCH:
				manager.searchAccountInfor();
				break;
			case A_EDIT:
				manager.editAccountInfo();
				break;
			case A_DELETE:
				manager.deleteAccountInfor();
				break;
			case A_SHOWACCOUNTLIST:
				manager.showAllAccountData();
				break;
			case A_TOTALORDERLIST:
				order.showOrderList();
				break;
			case A_EXITPROGRAMM:
				MainMenu.seperator();
				System.out.println("                     시스템을 종료합니다. 이용해주셔서 감사합니다^^                               ");
				MainMenu.seperator();
				return;
			default:
				System.out.println("각 기능에 맞는 번호를 선택해주세요.");

			}

			continue;

		}

	}

}
