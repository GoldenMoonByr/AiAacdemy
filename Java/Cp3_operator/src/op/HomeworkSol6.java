package op;
public class HomeworkSol6 {
	public static void main(String[] args) {
		int numOfApples =123; // 사과의 개수
		int sizeOfBucket =10;
		 // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (numOfApples/sizeOfBucket);
		 // 모든 사과를담는데 필요한 바구니의 수
		if (numOfApples%sizeOfBucket>0){
			 numOfBucket =  numOfBucket +1;
		}
		System.out.println("필요한바구니의 수 :"+numOfBucket);
	}
}
