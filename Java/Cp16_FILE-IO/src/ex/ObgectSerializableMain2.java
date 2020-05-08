package ex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObgectSerializableMain2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 기본 스트림
		FileInputStream fi = new FileInputStream("object.ser");
		// 파일에서 데이터를 추출 -> 객체 역직렬화 필터 스트림
		ObjectInputStream in = new ObjectInputStream(fi);

		Circle c1 = (Circle) in.readObject();
		Circle c2 = (Circle) in.readObject();
		String str = (String) in.readObject();
		c1.showCirtcleInfo();
		c2.showCirtcleInfo();
		System.out.println(str);

	}

}
