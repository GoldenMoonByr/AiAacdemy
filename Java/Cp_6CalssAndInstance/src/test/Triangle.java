package test;

public class Triangle {
	
	//변수 : 밑변 , 높이
	int width;		//밑변의 데이터
	int height;		//높이의 데이터
	
	//생성자 : 인스턴스 생성시에 반드시 한 번 실행 -> 인스턴스 변수들의 초기화 작업
	//				생략 가능 (default constructor)
	
	//기본 생성자
	Triangle(){	
		
	}
	
	Triangle(int w,int  h){
		width = w;
		height = h;
	}
	
	
	// 밑변과 높이 데이터를 변경하는 메서드
	//메서드를 정의하기 위해서는. 반환을 하는가? 입력받는
	//매개변수는 있는가?
	void setData(int w, int h) {
		width = w;
		height = h;
	}
	
	
	//삼각형의 넓이를 구해서 반환하는 메서드
	 float area() {
		 float result = width * height /2;
		 return result;
	}
	
	 public static void main(String[] args) {
		 //삼각형 객체를 생성해준다.
		 //Triangle t = new Triangle();
		 Triangle t = new Triangle (5,3);
		 //데이터 설정
		 //t.setData(10, 3);
				 
		 System.out.println("삼각형의 밑변은"+t.width+"높이는"+t.height);
		 
		//넓이를 구하는 메서드 실행
		 System.out.println("삼각형의 넓이는"+t.area()+"입니다.");
		 
	 }
	
}
