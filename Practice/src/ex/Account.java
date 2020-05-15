package ex;

public class Account {
	String id;
	String password;
	
	Account(String id , String password){
		this.id=id;
		this.password = password;
	}
	
	String getId() {
		return this.id;
	}
	
	void setId(String id) {
		this.id= id;
	}
	
	String getPassword() {
		return this.password;
	}
	
	void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
