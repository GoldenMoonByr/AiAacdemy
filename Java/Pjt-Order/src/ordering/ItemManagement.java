package ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemManagement {
	
	List<ItemInfo> ItemList;
	int num = 0;
	ExceptionClass ex = new ExceptionClass();

	ItemManagement() {
		ItemList = new ArrayList<>();
		
	}

	public void addItem() {
		while (true) {

			MainMenu.seperator();
			System.out.println("                                       새 상품 정보를 입력해주세요.                         ");
			MainMenu.seperator();
			ItemInfo newItem1 = new ItemInfo();
			System.out.println("[대분류] > ");
			newItem1.setBigCategory(ex.sc.nextLine());
			System.out.println("[중분류] > ");
			newItem1.setMediCategory(ex.sc.nextLine());
			System.out.println("[이름] > ");
			newItem1.setName(ex.sc.nextLine());
			try {
				System.out.println("[가격] > ");
				newItem1.setPrice(ex.sc.nextInt());
				System.out.println("[수량] > ");
				newItem1.setCount(ex.sc.nextInt());
			} catch (Exception e) {
				MainMenu.seperator();
				System.out.println("                           잘못된 입력입니다! 확인 후 다시 입력해주세요.                     ");
				System.out.println("                           상품의 가격과, 수량은 꼭 숫자로 입력해주세요.                     ");
				MainMenu.seperator();
				continue;
			} finally {
				ex.sc.nextLine();
			}

			MainMenu.seperator();
			System.out.println(
					"                                                저장되었습니다!                                                          ");
			MainMenu.seperator();
			ItemList.add(newItem1);
			break;
		}
	}

	public void deleteItem() {
		MainMenu.seperator();
		System.out.println("                              기존 거래처의 발주 가능 상품을 삭제합니다.                              ");
		MainMenu.seperator();
		System.out.println("[삭제할 상품 이름을 입력해주세요]>");

		String name = ex.sc.nextLine();
		boolean flag = false;

		System.out.println(name + " 거래처의 해당 상품을 삭제하시겠습니까? 1. Yes , 2. No");
		num = ex.sc.nextInt();

		if (num == 1) {
			for (int i = ItemList.size() - 1; i >= 0; i--)
				if (ItemList.get(i).getName().equals(name)) {
					flag = true;
					ItemList.remove(i);
					if (flag) {
						MainMenu.seperator();
						System.out.println(
								"                                     상품을 정상적으로 삭제했습니다.                        ");
						MainMenu.seperator();
						ex.sc.nextLine();
					} else {
						MainMenu.seperator();
						System.out.println(
								"                                      해당 상품이 존재하지 않습니다.                         ");
						MainMenu.seperator();
					}

				}

		}else if (num == 2) {
			System.out.println("이전 단계로 돌아갑니다.");
			return;

		}else {};

	}

	public void editItem() {
		MainMenu.seperator();
		System.out.println("                              기존 거래처의 발주 가능 상품을 수정합니다.                       ");
		MainMenu.seperator();
		System.out.println("[수정할 상품 이름을 입력해주세요]>");
		String name = ex.sc.nextLine();
		for (int i = ItemList.size() - 1; i >= 0; i--) {
			if (ItemList.get(i).getName().equals(name) == false) {
				MainMenu.seperator();
				System.out.println("                                      해당 상품 정보가 없습니다.");
				MainMenu.seperator();
				break;
			} else {
				System.out.println(name + "의 정보 수정");
				try {
					System.out.println("수정 후 상품 가격>");
					ItemList.get(i).setPrice(ex.sc.nextInt());
					System.out.println("수정 후 상품 수량>");
					ItemList.get(i).setCount(ex.sc.nextInt());
				} catch (Exception e) {
					MainMenu.seperator();
					System.out.println("                           잘못된 입력입니다! 확인 후 다시 입력해주세요.                      ");
					System.out.println("                             상품의 가격과, 수량은 숫자로 입력해주세요.                       ");
					MainMenu.seperator();
					continue;
				} finally {
					ex.sc.nextLine();
				}
				MainMenu.seperator();
				System.out
						.println("                                        정상적으로 수정되었습니다.                             ");
				MainMenu.seperator();
				break;
			}

		}
	}

	void showItemLIstData() {
		for (int i = 0; i < ItemList.size(); i++) {
			MainMenu.seperator2();
			System.out.println("[ 상품 번호] : [" + i + "]     [대분류] : " + ItemList.get(i).getBigCategory() + "\t[중분류] : "
					+ ItemList.get(i).getMediCategory() + "\t[이름] : " + ItemList.get(i).getName() + "\t[가격] : "
					+ ItemList.get(i).getPrice() + "\t[수량] : " + ItemList.get(i).getCount());

		}
	}

}
