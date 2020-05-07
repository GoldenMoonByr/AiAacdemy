package ordering;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountManagement manager = new AccountManagement();
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
			switch(number) {
			case 1:
				System.out.println("거래처 이름 >");
				String accountName = sc.nextLine();
				AccountInfo account = null;
				for()
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
		
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
				
			}
			
			
		}
	}


}
