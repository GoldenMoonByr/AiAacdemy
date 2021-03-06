package ver02;

import java.util.Scanner;

/*
 키보드로부터 데이터 입력 
↓
입력 받은 데이터로 인스턴스 생성
↓
생성된 인스턴스의 메소드 호출
 */

public class PhoneBookManager {
	Scanner sc = new Scanner(System.in);
	PhoneInfor infor = null;
	//PhoneInfor 형의 infor를 사용하기 위한 초기화.
	
	
	PhoneInfor makeInstance(){
		System.out.println("성함을 입력해주세요. :");
		String name=sc.nextLine();
		System.out.println("전화 번호를 입력해주세요. :");
		String phoneNumber = sc.nextLine();
		System.out.println("생년월일을 입력해주세요. :");
		String birthday = sc.nextLine();
		
		//birthday 입력 유무에 따라 다른 생성자들 넣기 위한 조건문
		//.trim=>양끝 공백 제거 , .isEmpty()=>공백인지 확인(boolean값)
		if(birthday==""||birthday.trim().isEmpty()) {
			infor = new PhoneInfor(name,phoneNumber);
		}
		else {
			infor = new PhoneInfor(name,phoneNumber,birthday);
		}
		
		return infor;
		
		
		
	}
	

}
