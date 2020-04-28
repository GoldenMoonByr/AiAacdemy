package ver05;

public class Menu {

	public static void showMenu() {
		System.out.println("==================================");
		System.out.println("@@@@메뉴 번호를 입력해주세요.@@@@");
		System.out.println("  ["+MenuNum.CREATE+"]   [대상자 정보 저장]");
		System.out.println("  ["+MenuNum.SEARCH+"]   [대상자 정보 검색]");
		System.out.println("  ["+MenuNum.EDIT+"]   [대상자 정보 수정]");
		System.out.println("  ["+MenuNum.DELETE+"]   [대상자 정보 삭제]");
		System.out.println("  ["+MenuNum.SHOWALLDATA+"]   [대상자 정보 전체 보기]");
		System.out.println("  ["+MenuNum.EXIT+"]   [프로그램 종료]");
		System.out.println("=================================");
	}

}
