package ordering;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagement {
	ArrayList<AccountInfo> InfoBooks;

	AccountInfo info;

	Scanner sc;

	AccountManagement() {

		InfoBooks = new ArrayList<>();
		info = null;
		sc = new Scanner(System.in);

	}


	AccountInfo accountSelect() {
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
		
		System.out.println("*******************************************************************************************");
		System.out.println("                                      성공적으로 저장되었습니다!                                                   ");
		System.out.println("*******************************************************************************************");
	}
	AccountInfo createInstance() {
		System.out.println("*******************************************************************************************");
		System.out.println("                                       신규 거래처를 저장합니다.                                                     ");
		System.out.println("*******************************************************************************************");
		System.out.println("거래처 이름을 입력해주세요.>");
		String accountName = sc.nextLine();
		System.out.println("거래처 담당자를 입력해주세요.>");
		String accountManager = sc.nextLine();
		System.out.println("거래처 연락처를 입력해주세요.>");
		String accountPhoneNumber = sc.nextLine();
		System.out.println("거래처 주소를 입력해주세요.>");
		String accountAddr = sc.nextLine();
		if (accountName ==null || accountName.trim().isEmpty()) {
			System.out.println("*******************************************************************************************");
			System.out.println("                                 거래처 이름은 꼭 입력해주셔야 합니다.                        ");
			System.out.println("*******************************************************************************************");
			createInstance();
		} else {
			info = new AccountInfo(accountName, accountManager, accountPhoneNumber, accountAddr);
		}
		return info;

	}

	void showAllAccountData() {
		for (int i = 0; i < InfoBooks.size(); i++) {
			System.out.println("*******************************************************************************************");
			InfoBooks.get(i).showAccountInfo();

		}
		System.out.println("*******************************************************************************************");
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
		while (true) {
			System.out.println("*******************************************************************************************");
			System.out.println("                                    기존 거래처의 정보를 검색합니다."                         );
			System.out.println("*******************************************************************************************");
			System.out.println("검색하실 거래처의 이름을 입력해주세요.");

			String name = sc.nextLine();
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("*******************************************************************************************");
				System.out.println("                       잘못된 정보 입니다. 다시 입력해주세요 :)                      ");

				continue;
			} else {
				InfoBooks.get(index).showAccountInfo();
				break;
			}
		}
	}

	void deleteAccountInfor() {
		while (true) {
			System.out.println("*******************************************************************************************");
			System.out.println("                                     기존 거래처의 정보를 삭제합니다.                       ");
			System.out.println("*******************************************************************************************");
			System.out.println("삭제하실 거래처의 이름을 입력해주세요.");
			String name = sc.nextLine();
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("잘못된 정보 입니다. 다시 입력해주세요.");
				continue;
			} else {
				InfoBooks.remove(index);
				System.out.println("*******************************************************************************************");
				System.out.println("                                해당 거래처의 정보가 삭제되었습니다                                  ");
				System.out.println("*******************************************************************************************");
				break;
			}
		}

	}

	void accountInfoEdit() {

		while (true) {
			System.out.println("수정하실 거래처의 이름을 입력해주세요.");
			String name = sc.nextLine();
			String newName=null;
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("잘못된 정보 입니다. 다시 입력해주세요.");
				continue;
			} else {
				System.out.println("*******************************************************************************************");
				System.out.println("                                     "+ name + "의 정보를 수정합니다.                       ");
				System.out.println("*******************************************************************************************");
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
					break;
				default: 
					System.out.println("*******************************************************************************************");
					System.out.println("                           잘못 입력하셨습니다. 다시 입력해주세요.");
					System.out.println("*******************************************************************************************");
					continue;
				}
			
				System.out.println("거래처의 담당자를 입력해주세요.>");
				String manager = sc.nextLine();
				System.out.println("거래처의 전화번호를 입력해주세요.>");
				String phoneNumber = sc.nextLine();
				System.out.println("거래처의 주소를 입력해주세요.>");
				String address = sc.nextLine();
				AccountInfo Info = null;
				info = new AccountInfo(newName, manager, phoneNumber, address);
				InfoBooks.remove(index);
				InfoBooks.add(index, info);
				System.out.println("*******************************************************************************************");
				System.out.println("                                 해당 거래처의 정보가 수정되었습니다!                      ");
				System.out.println("*******************************************************************************************");
				break;
			}

		}

	}

}
