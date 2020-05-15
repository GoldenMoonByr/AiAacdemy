package ordering;

import java.util.ArrayList;
import java.util.Scanner;

public class SellerManagement {
	ArrayList<SellerInfo> InfoBooks;

	SellerInfo info;

	Scanner sc;
	


	SellerManagement() {

		InfoBooks = new ArrayList<>();
		info = null;
		sc = new Scanner(System.in);
	}


	SellerInfo selectAccount() {
		System.out.println("선택하실 거래처 이름을 입력하세요. >");
		String name = sc.nextLine();
		for (int i = 0; i < InfoBooks.size(); i++) {
			if (InfoBooks.get(i).getAccountName().equals(name)) {
				return InfoBooks.get(i);
			}
		}
		return null;

	}

	void addAccount() {
		
		InfoBooks.add(createInstance());
		
		MainMenu.seperator();
		System.out.println("                                      성공적으로 저장되었습니다!                                                   ");
		MainMenu.seperator();
	}
	
	SellerInfo createInstance() {
		MainMenu.seperator();
		System.out.println("                                       신규 거래처를 저장합니다.                                                     ");
		MainMenu.seperator();
		System.out.println("거래처 이름을 입력해주세요.>");
		String accountName = sc.nextLine();
		System.out.println("거래처 담당자를 입력해주세요.>");
		String accountManager = sc.nextLine();
		System.out.println("거래처 연락처를 입력해주세요.>");
		String accountPhoneNumber = sc.nextLine();
		System.out.println("거래처 주소를 입력해주세요.>");
		String accountAddr = sc.nextLine();
		if (accountName ==null || accountName.trim().isEmpty()) {
			MainMenu.seperator();
			System.out.println("                                 거래처 이름은 꼭 입력해주셔야 합니다.                        ");
			MainMenu.seperator();
			createInstance();
		} else {
			info = new SellerInfo(accountName, accountManager, accountPhoneNumber, accountAddr);
		}
		return info;

	}

	void showAllAccountData() {
		for (int i = 0; i < InfoBooks.size(); i++) {
			MainMenu.seperator();
			InfoBooks.get(i).showAccountInfo();

		}
		MainMenu.seperator();
	}

	int searchIndex(String name) {
		int searchIndex = -1;
		for (int i = 0; i < InfoBooks.size(); i++) {
			if (InfoBooks.get(i).checkAccountName(name)) {
				searchIndex = i;
				break;
			}

		}
		return searchIndex;
	}

	void searchAccountInfor() {
		int count = 0;
		while (true) {
			MainMenu.seperator();
			System.out.println("                                    기존 거래처의 정보를 검색합니다."                         );
			MainMenu.seperator();
			System.out.println("검색하실 거래처의 이름을 입력해주세요.");

			String name = sc.nextLine();
			int index = searchIndex(name);
			if (index < 0) {
				MainMenu.seperator();
				System.out.println("           잘못된 정보 입니다. 다시 입력해주세요 :)"+(5-count)+"회 남았습니다.");
				count++;
				if(count ==6) {
					System.out.println("입력 횟수를 초과하였습니다. 전 단계로 돌아갑니다.");
					return;
				}
				continue;
			} else {
				InfoBooks.get(index).showAccountInfo();
				break;
			}
		}
	}

	void deleteAccountInfor() {
		while (true) {
			MainMenu.seperator();
			System.out.println("                                     기존 거래처의 정보를 삭제합니다.                       ");
			
		String name = sc.nextLine();
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("잘못된 정보 입니다. 다시 입력해주세요.");
				continue;
			} else {
				InfoBooks.remove(index);
				MainMenu.seperator();
				System.out.println("                                해당 거래처의 정보가 삭제되었습니다                                  ");
				MainMenu.seperator();
				break;
			}
		}

	}

	void editAccountInfo() {

		while (true) {
			System.out.println("수정하실 거래처의 이름을 입력해주세요.");
			String name = sc.nextLine();
			String newName=null;
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("잘못된 정보 입니다. 다시 입력해주세요.");
				continue;
			} else {
				MainMenu.seperator();
				System.out.println("                                     "+ name + "의 정보를 수정합니다.                       ");
				MainMenu.seperator();
				System.out.println("거래처의 이름을 수정하시겠습니까?(1.Yes , 2.No)");
				int num = Integer.parseInt(sc.nextLine());
				switch(num) {
				case 1: 
					System.out.println("수정하실 이름을 입력해주세요.>");
					newName =sc.nextLine();
					break;
				case 2: 
					System.out.println("거래처의 이름은 수정하지 않겠습니다.");
					newName = name;
					return;
				default: 
					MainMenu.seperator();
					System.out.println("                           잘못 입력하셨습니다. 다시 입력해주세요.");
					MainMenu.seperator();
					continue;
				}
			
				System.out.println("거래처의 담당자를 입력해주세요.>");
				String manager = sc.nextLine();
				System.out.println("거래처의 전화번호를 입력해주세요.>");
				String phoneNumber = sc.nextLine();
				System.out.println("거래처의 주소를 입력해주세요.>");
				String address = sc.nextLine();
				SellerInfo Info = null;
				info = new SellerInfo(newName, manager, phoneNumber, address);
				InfoBooks.remove(index);
				InfoBooks.add(index, info);
				MainMenu.seperator();
				System.out.println("                                 해당 거래처의 정보가 수정되었습니다!                      ");
				MainMenu.seperator();
				break;
			}

		}

	}

}