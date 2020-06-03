package manager;

public class Dept {
	private int deptno;				//부서 번호 
	private String dname;			//부서 이름
	private String loc;				//부서 위치
	

	
	// 생성자
	public Dept(int deptno , String name, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	

	public int getDeptno(){
		return this.deptno;
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public String getDname() {
		return this.dname;
	}
	
	public void getDname(String dname) {
		this.dname = dname;
	}
	
	public String getLoc() {
		return this.loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [detpno" + deptno +", dname=" + dname + ", loc=" + loc + "]";
	}


}
