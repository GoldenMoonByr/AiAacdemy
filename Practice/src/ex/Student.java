package ex;

public class Student extends Account {
	String subject;
	Student(String id, String password, String subject){
		super(id, password);
		this.subject = subject;
	}
	
	String getSubject() {
		return this.subject;
	}
	
	void setSubject(String subject) {
		this.subject = subject;
	}

}
