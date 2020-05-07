package order;

import java.util.ArrayList;
import java.util.List;

public class AccountInfo {
	String accountName;
	String accountPhoneNumber;
	String accountManager;
	String accountAddr;
	List<item>itemList = new ArrayList<>();

//	ArrayList<AccountInfo> AccountInfoBooks = null;

	AccountInfo(String accountName, String accountManager, String accountPhoneNumber, String accountAddr) {
		this.accountName = accountName;
		this.accountManager = accountManager;
		this.accountPhoneNumber = accountPhoneNumber;
		this.accountAddr = accountAddr;
	}
	
	void addItem(itemInfo){
		itemList.add(info);
	}
	
	
}
