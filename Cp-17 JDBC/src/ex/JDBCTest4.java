package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		

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
			
			stmt = conn.createStatement();
			String sql = "insert into dept (deptno, dname, loc)"
					+ " values (60, 'design','jeju')";
			
			int resultCnt = stmt.executeUpdate(sql);
			
			System.out.println(resultCnt+"개 행이 입력되었습니다.");
			
			
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
