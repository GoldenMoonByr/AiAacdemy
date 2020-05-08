package ordering;

import java.util.Scanner;

public class OrderSystem {
	int num = 0;
	Scanner sc = new Scanner(System.in);

	void orderItem(AccountInfo account) {
		System.out.println("발주하실 상품 번호와 발주 수량을 입력해주세요.");
		System.out.println("[상품 번호] > ");
		int orderItemNum = sc.nextInt();
		System.out.println("[발주 수량] > ");
		int orderItemCount = sc.nextInt();
		System.out.println(account.ItemList.get(orderItemNum).getName() + " 상품을 " + orderItemCount
				+ "개 선택하셨습니다.  발주 하시겠습니까? Yes : 1 , No : 2");
		num = sc.nextInt();
		sc.nextLine();
		if (num == 2) {
			return;
		}
		if (num == 1) {
			if(account.ItemList.get(orderItemNum).getCount()<orderItemCount)
			{
				System.out.println("수량이 부족합니다.");
			}
			else {
			System.out.println("발주되었습니다.");
			System.out.println(account.ItemList.get(orderItemNum).getName() + " 상품남은 발주 수량 : "
					+ (account.ItemList.get(orderItemNum).getCount() - orderItemCount));
			account.ItemList.get(orderItemNum).setCount(account.ItemList.get(orderItemNum).getCount() - orderItemCount);

			System.out.println("더 발주하시겠습니까?Yes : 1 , No : 2");
			num = sc.nextInt();
			sc.nextLine();
			}
		}

	}

}
