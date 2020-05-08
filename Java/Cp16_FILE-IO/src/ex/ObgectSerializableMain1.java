package ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObgectSerializableMain1 {
	
	public static void main(String[] args) throws IOException {
	
		//객체 저장
		FileOutputStream fo = new FileOutputStream("obgect. ser");
		//객체저장 필터 스트림
		ObjectOutputStream out  = new ObjectOutputStream(fo);
		
		out.writeObject(new Circle(1, 2, 1.2));
		out.writeObject(new Circle(3, 6, 3.6));
		out.writeObject(new String("String implments Serializable"));
		out.close();
		
		System.out.println("인스턴스의 데이터가 저장되었습니다.");
		
	}
	
	
	
	
}
