package ex;
//public class PersonalNumStorageImpl extends PersonalNumberStorage 
public class PersonalNumStorageImpl implements PersonalNumber {

	PersonalNumInfo[] perArr;
	int numOfperInfo;

	PersonalNumStorageImpl(int num) {
		perArr = new PersonalNumInfo[num];
		numOfperInfo = 0;
	}

	@Override
	public void addPersonalInfo(String perNum, String name) {
		perArr[numOfperInfo] = new PersonalNumInfo(name, perNum);
		numOfperInfo++;
	}

	@Override
	public String searchName(String perNum) {
		for (int i = 0; i < numOfperInfo; i++) {
			if (perArr[i].getNumber().equals(perNum)) {
				return perArr[i].getName();
			}
				
		}
	
		return null;
	}

}
