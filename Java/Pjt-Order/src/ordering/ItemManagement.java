package ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemManagement {

	List<Item> ItemList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	int num = 0;

	public void addItem() {
		while (true) {
			System.out.println("**********************************************************************");
			System.out.println("                         새 상품 정보를 입력해주세요.");
			System.out.println("**********************************************************************");
			Item newItem1 = new Item();
			System.out.println("[대분류] > ");
			newItem1.setBigCategory(sc.nextLine());
			System.out.println("[중분류] > ");
			newItem1.setMediCategory(sc.nextLine());
			System.out.println("[이름] > ");
			newItem1.setName(sc.nextLine());
			try {
				System.out.println("[가격] > ");
				newItem1.setPrice(sc.nextInt());
				sc.nextLine();
				System.out.println("[수량] > ");
				newItem1.setCount(sc.nextInt());
			} catch (Exception e) {
				System.out.println("**********************************************************************");
				System.out.println("            잘못된 입력입니다! 확인 후 다시 입력해주세요.");
				System.out.println("            상품의 가격과, 수량은 꼭 숫자로 입력해주세요.");
				System.out.println("**********************************************************************");
				continue;
			} finally {
				sc.nextLine();
			}

			System.out.println("**********************************************************************");
			System.out.println("\t\t\t\t   저장되었습니다!");
			System.out.println("**********************************************************************");
			ItemList.add(newItem1);
			break;
		}
	}

	public void deleteItem() {
		System.out.println("**********************************************************************");
		System.out.println("               기존 거래처의 발주 가능 상품을 삭제합니다.");
		System.out.println("**********************************************************************");
		System.out.println("[삭제할 상품 이름을 입력해주세요]>");
		
		String name = sc.nextLine();
		boolean flag = false;

		System.out.println(name+" 거래처의 정보를 삭제하시겠습니까? 1. Yes , 2. No");
		num = sc.nextInt();
		if(num==1)
		{
			for (int i = ItemList.size() - 1; i >= 0; i--) {
				if (ItemList.get(i).getName().equals(name)) {
					flag = true;
					ItemList.remove(i);
					if (flag) {
						System.out.println("**********************************************************************");
						System.out.println("\t\t\t상품을 정상적으로 삭제했습니다.");
						System.out.println("**********************************************************************");
					} else {
						System.out.println("**********************************************************************");
						System.out.println("\t\t\t해당 상품이 존재하지 않습니다.");
						System.out.println("**********************************************************************");
					}

				}
			}
		}else if(num==2){
			System.out.println("이전 단계로 돌아갑니다.");
			return;
		}
		
		
	}

	public void editItem() {
		System.out.println("**********************************************************************");
		System.out.println("              기존 거래처의 발주 가능 상품을 수정합니다.");
		System.out.println("**********************************************************************");
		System.out.println("[수정할 상품 이름을 입력해주세요]>");
		String name = sc.nextLine();
		for (int i = ItemList.size() - 1; i >= 0; i--) {
			if (ItemList.get(i).getName().equals(name) == false) {
				System.out.println("**********************************************************************");
				System.out.println("                           해당 상품 정보가 없습니다.");
				System.out.println("**********************************************************************");
				break;
			} else {
				System.out.println(name + "의 정보 수정");
				try {
					System.out.println("수정 후 상품 가격>");
					ItemList.get(i).setPrice(sc.nextInt());
					System.out.println("수정 후 상품 수량>");
					ItemList.get(i).setCount(sc.nextInt());
				} catch (Exception e) {
					System.out.println("**********************************************************************");
					System.out.println("            잘못된 입력입니다! 확인 후 다시 입력해주세요.");
					System.out.println("              상품의 가격과, 수량은 숫자로 입력해주세요.");
					System.out.println("**********************************************************************");
					continue;
				} finally {
					sc.nextLine();
				}
				System.out.println("**********************************************************************");
				System.out.println("\t\t\t  정상적으로 수정되었습니다.");
				System.out.println("**********************************************************************");
			}

		}
	}

	void showBasicData() {
		for (int i = 0; i < ItemList.size(); i++) {
			System.out.println(
					"****************************************************************************************************************");
			System.out.println("[ 상품 번호] : [" + i + "]     [대분류] : " + ItemList.get(i).getBigCategory() + "\t[중분류] : "
					+ ItemList.get(i).getMediCategory() + "\t[이름] : " + ItemList.get(i).getName() + "\t[가격] : "
					+ ItemList.get(i).getPrice() + "\t[수량] : " + ItemList.get(i).getCount());

		}
	}

}
