package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {

	public int deptEdit(Dept newDept, Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultCnt = 0;

		String sql = "update dept set dname=?, loc=? where deptno=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newDept.getDname());
			pstmt.setString(2, newDept.getLoc());
			pstmt.setInt(3, newDept.getDeptno());

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return resultCnt;
	}

	public int deptSearchCount(String searchName, Connection conn) {

		// Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int rowCnt = 0;

		// conn = ConnectionProvider.getConnection();

		String sql = "select count(*) form dept where dname=?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, searchName);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				rowCnt = rs.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rowCnt;

	}

	public Dept deptSearchName(String searchName, Connection conn) {

		Dept dept = null;
		// Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// conn = ConnectionProvider.gerConnection();

		String sql = "select * from dept where dname =?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchName);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dept = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dept;

	}

	public int deptInsert(Dept dept) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultCnt = 0;

		try {
			conn = ConnectionProvider.getConnetion();

			String sql = "insert into dept (deptno, dname, loc) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return resultCnt;

	}

	public int deptDelete(String dname) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultCnt = 0;

		try {
			conn = ConnectionProvider.getConnetion();

			String sql = "delete from dept where dname=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return resultCnt;

	}

	public List<Dept> deptSearch(String dname) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<Dept> list = new ArrayList<Dept>();

		try {
			conn = ConnectionProvider.getConnetion();
			String sql = "select * from dept where dname like '%' ||?||'%' or" + " loc like '%' || '%'";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, dname);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return list;

	}

	public List<Dept> deptList() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<Dept> deptList = new ArrayList<Dept>();

		try {
			conn = ConnectionProvider.getConnetion();
			String sql = "select * from dept order by dname";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 4. 데이터베이스 연결 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}
		return deptList;

	}

}
