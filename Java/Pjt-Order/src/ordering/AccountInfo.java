package ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountInfo {
	Scanner sc;
	String accountName;
	String accountPhoneNumber;
	String accountManager;
	String accountAddr;
	List<Item> ItemList;
	AccountInfo(String accountName, String accountPhoneNumber , String accountManager, String accountAddr){
		this.accountName = accountName;
		this.accountPhoneNumber = accountPhoneNumber;
		this.accountManager = accountManager;
		this.accountAddr = accountAddr;
		ItemList = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName= accountName;
	}
	
	
	public String getPhoneNumber() {
		return this.accountPhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.accountPhoneNumber=phoneNumber;
	}
	
	public String getAccountManager() {
		return this.accountManager;
	}
	
	public void setAccountManager(String accountManager) {
		this.accountName= accountManager;
	}
	
	
	public String getAccountAddr() {
		return this.accountAddr;
	}
	
	public void setAccountAddr(String accountAddr) {
		this.accountAddr = accountAddr;
	}
	
	
	
	
	
	
	
	public void addItem(Item newItem) {
		ItemList.add(newItem);
	}

	public void deleteItem(String name) {
		boolean flag = false;

		for (int i = ItemList.size() - 1; i >= 0; i--) {
			if (ItemList.get(i).getName().equals(name)) {
				flag = true;
				ItemList.remove(i);
				if (flag) {
					System.out.println("상품을 정삭적으로 지웠습니다.");
				} else {
					System.out.println("해당 상품이 존재하지 않습니다.");
				}

			}
		}
	}

	public void editItem(String name) {
		for (int i = ItemList.size() - 1; i >= 0; i--) {
			if (ItemList.get(i).getName().equals(name)) {
				System.out.println(name+"의 정보 수정");
				System.out.println("가격>");
				ItemList.get(i).setPrice(sc.nextInt());
				System.out.println("수량>");
				ItemList.get(i).setCount(sc.nextInt());
			}

		}
	}
	
	void showBasicData() {
		System.out.println("거래처 이름 : " + accountName);
		System.out.println("거래처 담당자 :" + accountManager);
		System.out.println("거래처 연락처 :" + accountPhoneNumber);
		System.out.println("거래처 주소 : " + accountAddr);

	}
	
	boolean checkAccountName(String name) {
		if (this.accountName.equals(name)) {
			return true;
		} else
			return false;

	}
	
	

}
