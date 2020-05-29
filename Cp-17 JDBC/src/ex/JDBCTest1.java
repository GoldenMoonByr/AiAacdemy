package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		
		try {
		//1. DB드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Oracle 드라이버 로드 성공!");
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "SCOTT";
		String pw = "tiger";
		
		//2. 테이터베이스에 접속
		conn = DriverManager.getConnection(url, user, pw);
		System.out.println("데이터베이스에 접속했습니다.");
		
		
		conn.setAutoCommit(false);
		//3. sql 로 데이터 처리...
		
		
		// commit : 처리 완료
		conn.commit();
		
		//4. close
		conn.close();
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			try{
			conn.rollback();
			}catch(SQLException e1) {
			e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
