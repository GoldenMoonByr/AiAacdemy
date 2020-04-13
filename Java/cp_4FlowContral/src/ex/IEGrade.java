package ex;

public class IEGrade {
	public static void main(String[] args) {
		int score = 99;
		String grade = "";
		
		//100~98: A+ , 97~94:A , 93~90:A-...
		if(score>=98 && score<=100) {
			grade = "A+";
		}
		
		if(score>=94 && score<=97) {
			grade = "A";
		}
		
		if(score>=93 && score<=90) {
			grade = "B+";
		}
		
					
				System.out.println(grade);
			
	}

}
