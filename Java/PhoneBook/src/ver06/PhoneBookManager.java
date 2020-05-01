package ver06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import ver06.exception.BadNumberException;

//2020.05.01 수정
//수정 내용 : ArrayList 컬렉션 적용하여 변경

//PhoneInfor 타입의 배열로 친구들의 정보를 저장, 수정, 삭제, 검색 , 출력
public class PhoneBookManager {

	// 1. 배열 생성
	// PhoneInfor[] inforsBook;
	// 정보를 저장할 배열리스트 생성
	ArrayList<PhoneInfor> pBooks;
	// 배열에 저장된 요소의 개수
	// int numOfInfor;
	Scanner sc;

	// 생성자를 통해서 배열 생성 , 요소의 개수 초기화
	private PhoneBookManager(int num) {

		// inforsBook = new PhoneInfor[num];
		// 정보를 저장할 배열리스트 초기화
		pBooks = new ArrayList<>();

		// numOfInfor = 0;
		sc = new Scanner(System.in);

	}

	// 싱글톤 처리
	private static PhoneBookManager manager = new PhoneBookManager(100);

	public static PhoneBookManager getInstandce() {
		return manager;
	}

	// 2. 배열에 정보 저장
	// 2-1 . 배열에 추가
	void addInfo(PhoneInfor infor) {
		// 배열에 numOfInfo 숫자 - > index로 참조값을 저장

		// 별도의 count 저장 index 번호를 지정하지 않아도
		// 알아서 순서대로 저장이 됨을 알 수 있다.
		pBooks.add(infor);

	}

	// 2.2 사용자로 부터 받은 인스턴스 생성
	void createInfor() throws InputMismatchException, BadNumberException, Exception, OutOfMemoryError {
		ExceptionMethod exceptionMethod = new ExceptionMethod();
		exceptionMethod.exceptionMethod1();

		PhoneInfor infor = null;
		String name = null;
		String phoneNumber = null;
		String addr = null;
		String email = null;

		while (true) {
			// 2.2.1 기본 정보 수집 : 이름, 전번, 주소, 이메일

			System.out.println("이름을 입력해주세요 : ");
			name = sc.nextLine();
			System.out.println("전화번호를 입력해주세요 : ");
			phoneNumber = sc.nextLine();
			System.out.println("주소를 입력해주세요 : ");
			addr = sc.nextLine();
			System.out.println("이메일을 입력해주세요 : ");
			email = sc.nextLine();

			try {
				if (name.trim().isEmpty() || phoneNumber.trim().isEmpty() || addr.trim().isEmpty()
						|| email.trim().isEmpty()) {
					StringEmptyException e = new StringEmptyException();
					throw e;
				}
			} catch (StringEmptyException e) {
				System.out.println("기본 정보는 모두 입력해주셔야 합니다.");
				System.out.println("다시 입력해주세요.\n");
				continue;
			}

			break;
		}

		switch (exceptionMethod.select) {
		// 2,2,2 기본 클래스로 인스턴스 생성
		case MenuNum.NORMAL:
			infor = new PhoneInfor(name, phoneNumber, addr, email);
			break;

		// 2.2.3 대학 클래스로 인스턴스 생성
		case MenuNum.UNIVFRIEND:
			System.out.println("전공(학과)를 입력해주세요.");
			String major = sc.nextLine();
			System.out.println("학년 정보를 입력해주세요.");
			String grade = sc.nextLine();

			infor = new PhoneUnivInfor(name, phoneNumber, addr, email, major, grade);
			break;
		// 2.2.4 회사 클래스로 인스턴스 생성
		case MenuNum.COMPANYFRIEND:
			System.out.println("회사명을 입력해주세요.");
			String company = sc.nextLine();
			System.out.println("부서의 이름을 입력해주세요.");
			String dept = sc.nextLine();
			System.out.println("직책(직급)정보를 입력해주세요.");
			String job = sc.nextLine();

			infor = new PhoneCompany(name, phoneNumber, addr, email, company, dept, job);
			break;
		// 2.2.5 동호회 클래스로 인스턴스 생성
		case MenuNum.CAFRFRIEND:
			System.out.println("동호회 이름을 입력해주세요.");
			String cafeName = sc.nextLine();
			System.out.println("닉네임을 입력해주세요.");
			String nickName = sc.nextLine();

			infor = new PhoneCafeInfo(name, phoneNumber, addr, email, cafeName, nickName);
			break;
		default:
			System.out.println("정상적인 메뉴 선택이 아닙니다. \n 메뉴를 다시 선택해주세요.");
			return;
		}

		addInfo(infor);
	}

	// 3. 배열의 데이터 출력
	void showAllData() {

		// for each 반복문 : 현재 이 프로그램에서는 사용 불가
		// for 반복문 : 반복의 횟수를 직접 지정가능 , numOfInfo
		System.out.println("==========전체 정보============");
		// 배열 리스트의 형태에 맞게 변경
		for (int i = 0; i < pBooks.size(); i++) {
			pBooks.get(i).showAllData();
			System.out.println("============================");

		}

	}

	// 배열의 index 검색 :인스턴스 name 기준
	int searchIndex(String name) {
		int searchIndex = -1; // 정상적인 index 값은 0~이상의 값, 찾지 못했을 때 구분 값 -1사용

		// 배열의 반복으로 name 값을 비교해서 index 값을 찾는다.
		for (int i = 0; i < pBooks.size(); i++) {
			if (pBooks.get(i).checkName(name))

			{
				searchIndex = i;
				break;
			}

		}

		return searchIndex;

	}

	// 4. 배열의 데이터 검색 : 이름 기준
	void showInfor() {
		System.out.println("검색하실 이름을 입력해주세요.");
		String name = sc.nextLine();
		int index = searchIndex(name);
		if (index < 0) {
			System.out.println("검색하신 이름의 정보가 없습니다.");
		} else {
			System.out.println("============================");
			pBooks.get(index).showAllData();
			System.out.println("============================");
		}

	}

	// 5. 배열의 정보를 삭제 : 이름 기준
	void delteInfo() {
		System.out.println("삭제하실 이름을 입력해주세요.");
		String name = sc.nextLine();
		int index = searchIndex(name);
		if (index < 0) {
			System.out.println("삭제하시고자 하는 이름의 정보가 없습니다.");
		} else {
			// 기존의 방법과 달리 삭제하는 기능 자체를 delete 메소드가 갖고 있으므로
			// delete 메소드만 선언해주면 된다.
			pBooks.remove(index);
			System.out.println("삭제되었습니다.");
			// 삭제 위치에서 왼쪽으로 shift
//			for (int i = index; i < pBooks.size() ; i++) {
//				pBooks.get(i)=pBooks.get(i+1);
		}
		// 삭제가 되었으므로 요소의 개수도 -1
		// numOfInfor--;
	}
//	}

	// 6. 배열의 정보를 수정 : 이름 기준
	void editInfo() {
		System.out.println("편집하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		int index = searchIndex(name);
		if (index < 0) {
			System.out.println("편집하고자 하는 이름의 정보가 없습니다.");
			return;
		} else {

			String editName = pBooks.get(index).getName();
			System.out.println("편집하실 내용을 입력해주세요.");
			System.out.println("이름은" + editName + "입니다.");
			System.out.println("전화번호를 입력해주세요.");
			String phoneNumber = sc.nextLine();
			System.out.println("주소를 입력해주세요.");
			String addr = sc.nextLine();
			System.out.println("이메일을 입력해주세요.");
			String email = sc.nextLine();

			PhoneInfor infor = null;
			// 저장된 인스턴스가 : 기본인지, 대학인지, 회사인지, 동호회인지
			// PhoneInfor[index] = > pBook.get(index)
			if (pBooks.get(index) instanceof PhoneUnivInfor) {
				System.out.println("전공을 입력해주세요.");
				String major = sc.nextLine();
				System.out.println("학년을 입력해주세요.");
				String grade = sc.nextLine();

				infor = new PhoneUnivInfor(editName, phoneNumber, addr, email, major, grade);
			} else if (pBooks.get(index) instanceof PhoneCompany) {
				System.out.println("회사명을 입력해주세요.");
				String company = sc.nextLine();
				System.out.println("부서명을 입력해주세요.");
				String dept = sc.nextLine();
				System.out.println("직책(직급)을 입력해주세요.");
				String job = sc.nextLine();

				infor = new PhoneCompany(editName, phoneNumber, addr, email, company, dept, job);

			} else if (pBooks.get(index) instanceof PhoneCafeInfo) {
				System.out.println("동호회명을 입력해주세요.");
				String cafeName = sc.nextLine();
				System.out.println("닉네임을 입력해주세요.");
				String nickName = sc.nextLine();

				infor = new PhoneCafeInfo(editName, phoneNumber, addr, email, cafeName, nickName);

			} else if (pBooks.get(index) instanceof PhoneInfor) {
				infor = new PhoneInfor(editName, phoneNumber, addr, email);
			}
			//해당 index에 저장하기 전에 반드시 기존 정보를 지워줘야 함
			pBooks.remove(index);
			// List의 index 위치에 새로운 정보 저장
			pBooks.add(index,infor);
		}

	}

}
