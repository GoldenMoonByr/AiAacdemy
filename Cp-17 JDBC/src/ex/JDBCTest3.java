package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = null;
		ResultSet rs = null;

		try {
			// 1. DB드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로드 성공!");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "SCOTT";
			String pw = "tiger";

			// 2. 테이터베이스에 접속
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. sql을 실행하기 위한 Statement : Connection
			//Statement stmt = conn.createStatement();
			
			
			Scanner kb = new Scanner(System.in);
			System.out.println("회원의 이름을 입력해주세요>>");
			String searchName = kb.nextLine();
			
	
				
			
			String sql = "select * from emp order by deptno";
		
			//Statement stmt = conn.prepareStatement(sql1);
			Statement stmt = conn.createStatement();
			
			String sql1 = "select o.orderid, c.name, b.bookname from customer c, book b ,orders o"
					+ " where c.custid = o.custid and b.bookid = o.bookid"
					+ " and c.name='"+searchName+"'";
			
			System.out.println("sql :" +sql1);
			System.out.println();
			System.out.println();
			System.out.println();
			// select 의 결과는 resultSet 이 받는다.
			// excuteQuery(sql문) -> resultSet
			rs = stmt.executeQuery(sql1);

			
			// ResultSet : next() -> 행의 존재 유무 확인

			//System.out.println("--------------------------");
			//System.out.println("사원번호\t사원이름\t직금");
			//System.out.println("--------------------------");
			
			System.out.println("판매리스트");
			System.out.println("-----------------------------");
			System.out.println("판매 아이디\t회원이름\t책이름");
			System.out.println("-----------------------------");
			
			while (rs.next()) {
				//System.out.print(rs.getInt("deptno")+ "\t");
				//System.out.print(rs.getString("dname")+ "\t");
				//System.out.print(rs.getString("loc")+ "\n");
				System.out.print(rs.getInt(1)+ "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3)+ "\n");

			}
			
			rs.close();
			stmt.close();
			// 4. close
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}

		}

	}

}
