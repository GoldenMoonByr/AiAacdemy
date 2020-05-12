package ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountInfo extends ItemManagement {
	
//필드
	Scanner sc;
	private String accountName;
	private String accountPhoneNumber;
	private String accountManager;
	private String accountAddr;

//생성자
	AccountInfo(){
		
	}
	AccountInfo(String accountName, String accountPhoneNumber, String accountManager, String accountAddr) {
		this.accountName = accountName;
		this.accountPhoneNumber = accountPhoneNumber;
		this.accountManager = accountManager;
		this.accountAddr = accountAddr;
		sc = new Scanner(System.in);
	}
	
	
	//게터 , 세터

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPhoneNumber() {
		return this.accountPhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.accountPhoneNumber = phoneNumber;
	}

	public String getAccountManager() {
		return this.accountManager;
	}

	public void setAccountManager(String accountManager) {
		this.accountName = accountManager;
	}

	public String getAccountAddr() {
		return this.accountAddr;
	}

	public void setAccountAddr(String accountAddr) {
		this.accountAddr = accountAddr;
	}



	
	//간단한 목록 출력 기능
	void showAccountInfo() {
		System.out.println("[거래처 이름]  >>>>>>>>" + accountName);
		System.out.println("[거래처 전화번호]  >>>>> " + accountPhoneNumber);
		System.out.println("[거래처 담당자] >>>>>>>" + accountManager);
		System.out.println("[거래처 주소]  >>>>>>>>" + accountAddr);
		
	}



	boolean checkAccountName(String name) {
		if (this.accountName.equals(name)) {
			return true;
		} else
			return false;

	}

}
