package ver06;

import java.util.InputMismatchException;
import java.util.Scanner;

import ver06.exception.BadNumberException;

public class ExceptionMethod {
	int select;
	Scanner sc;

	ExceptionMethod() {
		sc = new Scanner(System.in);
	}

	void exceptionMethod1() {

		while (true) {

			System.out.println("1. 일반 2. 대학 3. 회사 4. 동호회");
			System.out.println("저장하고자 하는 친구종류 숫자를 입력해주세요 : ");

			try {

				select = sc.nextInt();

				if (!(select >= MenuNum.NORMAL && select <= MenuNum.CAFRFRIEND)) {

					// 강제적인 예외 발생
					throw new BadNumberException("잘못된 메뉴 입력입니다!");
				}

			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다^^ 다시 입력해주세요.");
				// manager.sc.nextLine();
				continue;
			} catch (BadNumberException e) {
				System.out.println("메뉴 범위를 벗어난 숫자 입력입니다.\n 다시 확인 후 입력해주세요.");
				continue;
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다^^ 다시 입력해주세요.");
				// manager.sc.nextLine();
				continue;
			} finally {
				sc.nextLine();
			}
			break;

		}
	}

	void exceptionMethod2() {
		while (true) {

			Menu.showMenu();

			try {
				select = sc.nextInt();

				// 정상 범위는 1~6
				// MenuNum.INSERT ~ MenuNum.EXIT
				if (!(select >= MenuNum.CREATE && select <= MenuNum.EXIT)) {

					BadNumberException e = new BadNumberException("잘못된 메뉴 입력입니다!");
					// 강제적인 예외 발생
					throw e;

				}

			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다^^ 다시 입력해주세요.");
				// manager.sc.nextLine();
				continue;
			} catch (BadNumberException e) {
				System.out.println("잘못된 입력입니다!!");
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다^^ 다시 입력해주세요.");
				// manager.sc.nextLine();
				continue;
			} finally {
				sc.nextLine();
			}
			// manager.sc.nextLine();
			break;
		}

	}

}
