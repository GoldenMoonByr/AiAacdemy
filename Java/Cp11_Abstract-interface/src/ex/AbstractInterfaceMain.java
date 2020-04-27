package ex;

public class AbstractInterfaceMain {
	public static void main(String[] args) {
		
		//PersonalNumberStorage storage =  new PersonalNumStorageImpl(100);
		PersonalNumber storage = new PersonalNumStorageImpl(100);
		
		storage.addPersonalInfo("202020-111111", "이민수");
		storage.addPersonalInfo("202020-123123", "김민수");
		
		System.out.println(storage.searchName("202020-111111"));
		System.out.println(storage.searchName("202020-123123"));
		
	}

}
