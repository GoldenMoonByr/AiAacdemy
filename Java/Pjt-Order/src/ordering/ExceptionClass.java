package ordering;

import java.util.Scanner;

public class ExceptionClass {
	
	Scanner sc = new Scanner(System.in);
	int key2 = 0;
	int num = 0;
	int key = 0;

	int inpueException(){
		try {
			key = sc.nextInt();
		} catch (Exception e) {

			MainMenu.seperator();
			System.out.println("                    잘못된 입력입니다! 확인 후 다시 입력해주세요.                     ");
			MainMenu.seperator();
		}finally {
			sc.nextLine();
		}
		return key;
	}
	
}
