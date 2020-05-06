package order;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	ArrayList<AccountInfo> InfoBooks;
	

	AccountInfo info;
	ListManagement lists = new ListManagement();
	Scanner sc;

	

	AccountManager() {
	
		InfoBooks = new ArrayList<>();
		info = null;
		sc = new Scanner(System.in);

	}
	
	

	void addAccount() {
		//accountInfoBooks.add(createInstance());
		InfoBooks.add(createInstance());
	
		System.out.println("저장되었습니다!");
	}

	
	
	AccountInfo createInstance() {
		System.out.println("거래처 이름을 입력해주세요.");
		String accountName = sc.nextLine();
		System.out.println("거래처 담당자를 입력해주세요.");
		String accountManager = sc.nextLine();
		System.out.println("거래처 연락처를 입력해주세요.");
		String accountPhoneNumber = sc.nextLine();
		System.out.println("거래처 주소를 입력해주세요.");
		String accountAddr = sc.nextLine();
		info = new AccountInfo(accountName, accountManager, accountPhoneNumber, accountAddr);
		return info;

	}
	
	void showAllAccountData() {
		for(int i = 0;  i<InfoBooks.size();i++) {
			System.out.println("==============================");
			InfoBooks.get(i).showBasicData();
		
		}
	}
	
	int searchIndex(String name) {
		int searchIndex = -1;
		for (int i = 0; i <InfoBooks.size(); i++) {
			if (InfoBooks.get(i).checkAccountName(name)) {
				searchIndex=i;
				break;
			}

		}
		return searchIndex;
	}

	void searchAccountInfor() {
		while (true) {
			System.out.println("검색하실 거래처의 이름을 입력해주세요.");
			String name = sc.nextLine();
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("잘못된 정보 입니다. 다시 입력해주세요.");
				continue;
			} else {
				InfoBooks.get(index).showBasicData();
				System.out.println("해당 업체의 발주 가능 품목을 검색하시겠습니까?(예는 1번을, 아니오는 2번을 눌러주세요.)");
				int num = sc.nextInt();
				if(num==1) {lists.showAllData();}
				else if(num==2) {
					System.out.println("전 단계로 돌아갑니다.");
					break;
				}
			}
		}
	}
	
	

	void deleteAccountInfor() {
		while (true) {
			System.out.println("삭제하실 거래처의 이름을 입력해주세요.");
			String name = sc.nextLine();
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("잘못된 정보 입니다. 다시 입력해주세요.");
				continue;
			} else {
				InfoBooks.remove(index);
				System.out.println("해당 거래처의 정보가 삭제되었습니다.");
				break;
			}
		}

	}

	void accountInfoEdit() {

		while (true) {
			System.out.println("수정하실 거래처의 이름을 입력해주세요.");
			String name = sc.nextLine();
			int index = searchIndex(name);
			if (index < 0) {
				System.out.println("잘못된 정보 입니다. 다시 입력해주세요.");
				continue;
			} else {
				System.out.println(name + "의 정보를 수정하겠습니다.");
				System.out.println("거래처의 담당자를 입력해주세요.");
				String manager = sc.nextLine();
				System.out.println("거래처의 전화번호를 입력해주세요.");
				String phoneNumber = sc.nextLine();
				System.out.println("거래처의 주소를 입력해주세요.");
				String address = sc.nextLine();
				AccountInfo Info = null;
				info = new AccountInfo(name, manager, phoneNumber, address);
				InfoBooks.remove(index);
				InfoBooks.add(index, info);
				System.out.println("수정되었습니다!");
				break;
			}

		}

	}

}