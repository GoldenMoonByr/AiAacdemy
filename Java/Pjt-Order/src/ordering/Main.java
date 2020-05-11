package ordering;

import java.util.ArrayList;
import java.util.Scanner;

public class Main implements MenuNumInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManagement manager = new AccountManagement();
		AccountInfo account = null;
		OrderSystem order = new OrderSystem();
		int key2 = 0;
		int num = 0;
		int key = 0;

		while (true) {
			MainMenu.menuList();
			try {
				key = sc.nextInt();

			} catch (Exception e) {
				System.out.println("**********************************************************************");
				System.out.println("            잘못된 입력입니다! 확인 후 다시 입력해주세요.");
				System.out.println("**********************************************************************");
			} finally {
				sc.nextLine();
			}
			switch (key) {
			case A_SELECT:
				account = manager.accountSelect();
				if (account == null) {
					System.out.println("**********************************************************************");
					System.out.println("                      찾으시는 거래처 정보가 없습니다.");
					System.out.println("**********************************************************************");
					break;
				}

				while (true) {
					try {
						System.out.println("[1] 상품 전체 출력  [2] 상품 추가  [3] 상품 삭제  [4] 상품 수정  [5] 이전 단계로 나가기");
						key2 = sc.nextInt();
					} catch (Exception e) {
						System.out.println("**********************************************************************");
						System.out.println("            잘못된 입력입니다! 확인 후 다시 입력해주세요.");
						System.out.println("**********************************************************************");
					} finally {
						sc.nextLine();
					}

					if (key2 == I_EXIT)
						break;

					switch (key2) {
					case I_ORDER:
						order.orderItem(account);
						break;
					case I_ADD:
						account.addItem();
						break;
					case I_DELETE:
						account.deleteItem();
						break;
					case I_EDIT:
						account.editItem();
						break;
					default:
						System.out.println("**********************************************************************");
						System.out.println("                   잘못된 값입니다. 다시 입력해주세요.");
						System.out.println("**********************************************************************");
						break;
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
				manager.accountInfoEdit();
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
				return;

			default:
				System.out.println("**********************************************************************");
				System.out.println("               잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println("**********************************************************************");
			}

			continue;

		}

	}

}
