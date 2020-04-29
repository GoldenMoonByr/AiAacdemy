package ver06;

import java.util.InputMismatchException;

import ver06.exception.BadNumberException;

public class PhoneBookMain {
	public static void main(String[] args) throws InputMismatchException, BadNumberException, Exception {

		PhoneBookManager manager = PhoneBookManager.getInstandce();

		ExceptionMethod exceptionMethod = new ExceptionMethod();

		while (true) {
			// 예외처리가 필요한 부분들은 따로 메소드를 생성해서
			// 그 메소드에서 따로 처리하도록 한 번 해봤는데
			// 강사님께서 나중에 큰 프로젝트를 할 때
			// 한 객체에 문제를 일으키면 다른 객체에서도
			// 영향 받아 문제를 일으킬 수도 있다고 하셨음

			// 메뉴에서 원하는 기능을 번호로 입력받아서, 예외가 생길 경우,
			// 안 생길 경우를 비교하여 그에 맞는 내용을 화면에 출력하는 메소드
			exceptionMethod.exceptionMethod2();

			switch (exceptionMethod.select) {
			case MenuNum.CREATE:
				manager.createInfor();
				break;
			case MenuNum.SEARCH:
				manager.showInfor();
				break;
			case MenuNum.EDIT:
				manager.editInfo();
				break;
			case MenuNum.DELETE:
				manager.delteInfo();
				break;
			case MenuNum.SHOWALLDATA:
				manager.showAllData();
				break;
			case MenuNum.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;

			}

		}

	}

}
