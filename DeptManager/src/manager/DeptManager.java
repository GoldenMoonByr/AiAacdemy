package manager;

import java.sql.Connection;
import java.sql.SQLException;

public class DeptManager {

	DeptDao dao = new DeptDao();

	public void deptEdit() {

		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnetion();

			conn.setAutoCommit(false); // 자동 커밋 : 기본값은 true;

			// 수정하고자 하는 데이터 유무 확인 -> 사용자로부터 데이터 받아서 전달

			System.out.println("수정하고자 하는 부서 이름 :");
			Main.sc.nextLine();
			String searchName = Main.sc.nextLine();

			// 1. 수정하고자 하는 데이터 유무 확인
			int rowCnt = dao.deptSearchCount(searchName, conn);

			if (rowCnt > 0) {

				Dept dept = dao.deptSearchName(searchName, conn);

				if (dept == null) {
					System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
					return;
				}

				// 사용자 입력정보 변수
				System.out.println("부서 정보를 입력해주세요.");
				System.out.println("부서 번호 : " + dept.getDeptno());
				System.out.println("부서 번호는 수정되지 않습니다.");
				System.out.println("부서 이름 :" + dept.getDname());
				System.out.println(">>");
				String dname = Main.sc.nextLine();
				System.out.println("지역 이름 :" + dept.getLoc());
				System.out.println(">>");
				String loc = Main.sc.nextLine();

				// 공백 입력에 대한 예외처리가 있어야 하나 이번 버전에서는 모두 잘 입력 된 것으로 처리.

				Dept newDept = new Dept(dept.getDeptno(), dname, loc);

				int resultCnt = dao.deptEdit(newDept, conn);

				if (resultCnt > 0) {
					System.out.println("정상적으로 수정 되었습니다.");
					System.out.println(resultCnt + "행이 수정되었습니다.");
				} else {
					System.out.println("수정이 되지 않았습니다. 확인 후 재시도 해주세요.");
				}

			} else {
				System.out.println("찾으시는 이름의 정보가 존재하지 않ㅅ습니다.");
			}

			conn.commit();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void deptInsert() {
		
		System.out.println("부서 정보를 입력해주세요.");
		
		System.out.println("부서 번호 :");
		int deptno = Main.sc.nextInt();
		System.out.println("부서 이름 :");
		String dname = Main.sc.nextLine();
		System.out.println("부서 위치 :");
		String loc = Main.sc.nextLine();
		Dept dept = new Dept(deptno, dname, loc);
		int resultCnt = dao.deptInsert(dept);
		
		if (resultCnt > 0 ) {
			System.out.println("정상적으로 입력 되었습니다.");
			System.out.println(resultCnt + "행이 입력 되었습니다.");
		}else {
			System.out.println("입력이 되지 않았습니다. 확인 후 재시도해주세요.");
		}
	}

	public void deptDelete() {
		System.out.println("삭제하고자 하는 부서이름 :");
		Main.sc.nextLine();
		String searchName=Main.sc.nextLine();
		
		int resultCnt = dao.deptDelete(searchName);
		
	}
	
	public void deptSearch() {
		
		System.out.println("검색하고자 하는 부서이름 :");
		Main.sc.nextLine();
		String searchName = Main.sc.nextLine();
		
		List<Dept> list = dao.deptSearch(searchName);
		
		System.out.println("검색 결과");
		System.out.println("=======================");
		for(Dept d : list) {
			System.out.printf("%5s", d.getDeptno() + "\t");
			System.out.printf("%12s",d.getDname()+ "\t");
			System.out.printf("%12s", d.getLoc()+"\t");
		}
		System.out.println("=======================");
		
		
	}
	
	public void deptList() {
		
		List<Dept> deptList = dao.deptList();
		
	}
	
	
	
	
	
	
	
	
}