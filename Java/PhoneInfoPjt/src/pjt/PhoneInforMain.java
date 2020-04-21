package pjt;
//수정일 :  2020-04-21

//수정자 :   이민수
//수정내용
//Version 0.1 전화번호 관리 프로그램. 
//
//PhoneInfor 라는 이름의 클래스를 정의해 보자. 
//클래스는 다음의 데이터들의 문자열 형태로 
//저장이 가능 해야 하며, 저장된 데이터의 적절한 출력이 가능하도록 메소드 정의
//• 이름            name              String
//• 전화번호       phoneNumber     String
//• 생년월일       birthday            String 
//
//단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.

//수정일 :  2020-04-21
//수정자 :   이민수
//수정내용
//Project : ver 0.20
//"프로그램 사용자로부터 데이터 입력"
//프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이
//핵심.
//단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다.
//프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.
//
//키보드로부터 데이터 입력 
//↓
//입력 받은 데이터로 인스턴스 생성
//↓
//생성된 인스턴스의 메소드 호출


//Project : ver 0.30
//배열을 이용해서 프로그램 사용자가 입력하는 정보가 최대 100개까지
//유지되도록 프로그램을 변경. 아래기능 삽입
//저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
//검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
//삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제
//데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
//재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장


import java.util.Scanner;

public class PhoneInforMain {

	public static void main(String[] args) {

		String[][] info = new String[100][3];
		Scanner s = new Scanner(System.in);

		for(int i= 0 ; i<100 ; i++) {
			for(int j =0 ; j<3 ; j++) {
			System.out.println("이름을 입력하세요.");
			info[i][j] = s.nextLine();
			System.out.println("번호를 입력하세요.");
			info[i][j] = s.nextLine();
			System.out.println("생년월일을 입력하세요.(선택사항. 입력하시지 않으실 경우 Enter키를 눌러주세요.))");
			info[i][j] = s.nextLine();
			if (info[i][j].equals("")) {
				PhoneInfor[] member = new PhoneInfor(info[i], info[i]);
				member.showInfo();
			} else {
				PhoneInfor member1 = new PhoneInfor(info[0], info[1], info[2]);
				member1.showInfo();
			}
			
			System.out.println("입력하신 정보를 저장하시겠습니까?");
			String check = s.nextLine();
			if (check.equals("y")) {
				System.out.println(info[0]+"님의 정보가 저장되었습니다.");
			} else if (check.equals("n")) {
				System.out.println("다시 입력해주세요.");
				continue;	
			}
			
			while (true) {
				System.out.println("추가로 입력을 원하신다면 y,종료를 원하신다면 n 키를 입력해주세요.");
				String power = s.nextLine();
				if (power.equals("y")) {
					break;
				} else if (power.equals("n")) {
					System.out.println("프로그램이 종료되었습니다.");
					return;
				} else {
					System.out.println("선택사항을 다시 한 번 입력해주세요.");
				}

			}
			continue;
		}

//		{
//
//			PhoneInfor h1 = new PhoneInfor("이민수", "010-4734-0608");
//			PhoneInfor h2 = new PhoneInfor("김동길", "010-3980-1633", "950605");
//			PhoneInfor h3 = new PhoneInfor("박순경", "010-4877-3312");
//			h1.showInfo();
//			h2.showInfo();
//			h3.showInfo();
//
//		}

	}

}
	
	
