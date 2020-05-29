package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {

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
			conn = DriverManager.getConnection(url, user, pw)
					;
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. sql을 실행하기 위한 Statement : Connection
			
			Statement stmt = conn.createStatement();

			String sql = "select * from dept order by deptno";

			// select 의 결과는 resultSet 이 받는다.
			// excuteQuery(sql문) -> resultSet
			rs = stmt.executeQuery(sql);

			// ResultSet : next() -> 행의 존재 유무 확인

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
