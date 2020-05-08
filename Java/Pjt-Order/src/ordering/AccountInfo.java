package ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountInfo {
	Scanner sc;
	private String accountName;
	private String accountPhoneNumber;
	private String accountManager;
	private String accountAddr;
	List<Item> ItemList = new ArrayList<>();
	AccountInfo(String accountName, String accountPhoneNumber , String accountManager, String accountAddr){
		this.accountName = accountName;
		this.accountPhoneNumber = accountPhoneNumber;
		this.accountManager = accountManager;
		this.accountAddr = accountAddr;
//		ItemList = new ArrayList<>();
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
	
	void showAccountInfo() {
		System.out.println("[거래처 이름] > "+ accountName);
		System.out.println("[거래처 전화번호] > "+accountPhoneNumber );
		System.out.println("[거래처 담당자] > "+accountManager );
		System.out.println("[거래처 주소] > "+ accountAddr);
		
		
	}
	void showBasicData() {
		for(int i =0 ; i <ItemList.size() ; i++) {
			System.out.println("["+i+"] [대분류] : "+ItemList.get(i).getBigCategory()+ "\t중분류] : " + ItemList.get(i).getMediCategory() + "\t[이름] : " +ItemList.get(i).getName() +"\t[가격] : "+ItemList.get(i).getPrice() +"\t[수량] : "+ItemList.get(i).getCount());
		}
	}
	
	
	
	
	boolean checkAccountName(String name) {
		if (this.accountName.equals(name)) {
			return true;
		} else
			return false;

	}
	
	

}
