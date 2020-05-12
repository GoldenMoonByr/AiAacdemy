package ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderSystem {
	int num = 0;
	int currentMoney = 1000000;//판매 기능과의 연결 전 샘플 데이터
	int stockCount = 10;//재고 기능과의 연결 전 샘플 데이터
	Scanner sc = new Scanner(System.in);
	ArrayList<Item> orderList = new ArrayList<>();
	List<Integer> orderItemcounts = new ArrayList<>();
	

	void orderItem(AccountInfo account) {

		while (true) {
			
			account.showBasicData();
		
			System.out.println("****************************************************************************************************************");
			System.out.println(account.getAccountName() + "에서 발주 하시겠습니까? Yes : 1 , No : 2");
			int orderItemNum;
			int orderItemCount;
			try {
			num = sc.nextInt();
		 }catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}finally {
				sc.nextLine();
			}
			if (num == 2) {
				break;
			} else if (num == 1) {
				while(true) {
					System.out.println("*******************************************************************************************");
					System.out.println("                            발주하실 상품 번호와 발주 수량을 입력해주세요.                     ");
					System.out.println("*******************************************************************************************");
				try {
				System.out.println("[상품 번호] > ");
				orderItemNum = sc.nextInt();
				sc.nextLine();
				System.out.println("[발주 수량] > ");
				orderItemCount = sc.nextInt();

				sc.nextLine();
				
				System.out.println(account.ItemList.get(orderItemNum).getName() + " 상품을 " + orderItemCount
						+ "개 선택하셨습니다.  발주 하시겠습니까? Yes : 1 , No : 2");
				System.out.println("                         "+account.ItemList.get(orderItemNum).getName()+"발주 후 상품의 예상 재고 수량 : " +(account.ItemList.get(orderItemNum).getCount()+stockCount+"개"));
				System.out.println("*******************************************************************************************");
				num = sc.nextInt();
	
		}catch(Exception e){
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}finally {
					sc.nextLine();
				}
				

				if (num == 2) {
					return;
				}
				if (num == 1) {
					if (account.ItemList.get(orderItemNum).getCount() < orderItemCount) {
						System.out.println("*******************************************************************************************");
						System.out.println("                                            수량이 부족합니다.");
						System.out.println("*******************************************************************************************");
					} else {
						System.out.println("*******************************************************************************************");
						System.out.println("                                            발주 완료되었습니다.");
						System.out.println("*******************************************************************************************");
						orderList.add(account.ItemList.get(orderItemNum));
						orderItemcounts.add(orderItemCount);
						System.out.println("*******************************************************************************************");
						System.out.println("                             "+account.ItemList.get(orderItemNum).getName() + "  상품의 남은 발주 가능 재고 수량 : "
								+ (account.ItemList.get(orderItemNum).getCount() - orderItemCount));
						account.ItemList.get(orderItemNum)
								.setCount(account.ItemList.get(orderItemNum).getCount() - orderItemCount);
						System.out.println("*******************************************************************************************");

						System.out.println("해당 거래처에서 더 발주하시겠습니까?Yes : 1 , No : 2");
						num = sc.nextInt();
						sc.nextLine();
						if (num == 1) {
							continue;
						} else if (num == 2) {
							System.out.println("*******************************************************************************************");
							System.out.println("                                해당 거래처를 이용해주셔서 감사합니다^^!");
							System.out.println("*******************************************************************************************");
							return;
						}

					}
				}

				}
		    }
		}

		
	}

	void showOrderList() {
		int sum = 0;
		System.out.println("총발주 내역서를 출력합니다.");
		for (int i = 0; i < orderList.size(); i++) {
			System.out.println("***********************************************************************************************************************");
			System.out.println("대분류 : " + orderList.get(i).getBigCategory() + "\t중분류 : "
					+ orderList.get(i).getMediCategory() + "\t이름 : " + orderList.get(i).getName() + "\t원가 : "
					+ orderList.get(i).getPrice() + "원 \t수량 : " + orderItemcounts.get(i) + "개 \t해당 상품 총액 : "
					+ orderList.get(i).getPrice() * orderItemcounts.get(i)+"원");
			sum = sum + orderList.get(i).getPrice() * orderItemcounts.get(i);
		}
		System.out.println("***********************************************************************************************************************");
		System.out.println("[현 시재 > "+currentMoney+"원]         [총 발주 금액 >" + sum + "원]          [발주 후 시재 : "+ (currentMoney-sum)+"원]");
		System.out.println("***********************************************************************************************************************");
	}

}
