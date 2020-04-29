package ver05_2;

public interface MenuNum {

// [1]   [대상자 정보 저장]
	int INSERT = 1;
// [2]   [대상자 정보 검색]
	int SEARCH = 2;
//	[3]   [대상자 정보 수정]
	int DELETE = 3;
//	[4]   [대상자 정보 삭제]
	int EDIT = 4;
//	[5]   [대상자 정보 전체 보기]
	int SHOWALLDATA = 5;
//	[6]   [프로그램 종료]
	int EXIT = 6;

	//	1.대학  
	int UNIVFR = 1;
	// 2.회사
	int COMPANYFR = 2;
	// 3.동호회
	int CAFEFR =3;

	// public static final 자료형 상수 = 리터럴;

	
	char INSERT_CHAR = 'I';
}
