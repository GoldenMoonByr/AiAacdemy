package order;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManager manager = new AccountManager();
		Item listManager = new Item();
		
		while(true) {
			System.out.println("====================");
			System.out.println("1.거래처 등록");
			System.out.println("2.거래처 검색");
			System.out.println("3.거래처 수정");
			System.out.println("4.거래처 삭제");
			System.out.println("5.거래처 목록");
			System.out.println("6.발주 관리");
			System.out.println("====================");
			int number = sc.nextInt();
			sc.nextLine();
			switch(number) {
			case 1: 
				manager.addAccount();
				break;
			case 2:
				manager.searchAccountInfor();
				break;
			case 3:
				manager.accountInfoEdit();
				break;
			case 4:
				manager.deleteAccountInfor();
				break;
			case 5:
				manager.showAllAccountData();
				break;
			case 6:
				listManager.itemList();
				listManager.showAllData();
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
				
			}
			
			
		}
	}

}
