package order;

import java.util.ArrayList;
import java.util.Collection;

public class AccountInfo {
	String accountName;
	String accountPhoneNumber;
	String accountManager;
	String accountAddr;
	Item itemList;
	ArrayList<Item> lists;

//	ArrayList<AccountInfo> AccountInfoBooks = null;

	AccountInfo(String accountName, String accountManager, String accountPhoneNumber, String accountAddr) {
		this.accountName = accountName;
		this.accountManager = accountManager;
		this.accountPhoneNumber = accountPhoneNumber;
		this.accountAddr = accountAddr;
		lists = new ArrayList<>();
	}
	
	void addLists() {
		itemList.itemList();
	}

	void showBasicData() {
		System.out.println("거래처 이름 : " + accountName);
		System.out.println("거래처 담당자 :" + accountManager);
		System.out.println("거래처 연락처 :" + accountPhoneNumber);
		System.out.println("거래처 주소 : " + accountAddr);

	}


//	void showAllData() {

//		System.out.println("판매 품목");
//		for(int i = 0; i < AccountInfoBooks.size();i++) {
//			AccountInfoBooks.get(i).showAllData();
//		}
//	}

	boolean checkAccountName(String name) {
		if (this.accountName.equals(name)) {
			return true;
		} else
			return false;

	}

}
