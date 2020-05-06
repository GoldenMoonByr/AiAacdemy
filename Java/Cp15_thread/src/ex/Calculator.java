package ex;

public class Calculator {

	//메서드 실행 횟수 카운트
	int opCnt = 0;
	
	synchronized int add(int n1, int n2) {
		opCnt++;
		return n1+n2;
	}
	
	synchronized int min(int n1 , int n2) {
		opCnt++;
		return n1-n2;
	}
}
