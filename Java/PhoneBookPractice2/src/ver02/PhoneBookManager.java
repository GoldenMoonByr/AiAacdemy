package ver02;

import java.util.Scanner;

/*
 Ű����κ��� ������ �Է� 
��
�Է� ���� �����ͷ� �ν��Ͻ� ����
��
������ �ν��Ͻ��� �޼ҵ� ȣ��
 */

public class PhoneBookManager {
	Scanner sc = new Scanner(System.in);
	PhoneInfor infor = null;
	//PhoneInfor ���� infor�� ����ϱ� ���� �ʱ�ȭ.
	
	
	PhoneInfor makeInstance(){
		System.out.println("������ �Է����ּ���. :");
		String name=sc.nextLine();
		System.out.println("��ȭ ��ȣ�� �Է����ּ���. :");
		String phoneNumber = sc.nextLine();
		System.out.println("��������� �Է����ּ���. :");
		String birthday = sc.nextLine();
		
		//birthday �Է� ������ ���� �ٸ� �����ڵ� �ֱ� ���� ���ǹ�
		//.trim=>�糡 ���� ���� , .isEmpty()=>�������� Ȯ��(boolean��)
		if(birthday==""||birthday.trim().isEmpty()) {
			infor = new PhoneInfor(name,phoneNumber);
		}
		else {
			infor = new PhoneInfor(name,phoneNumber,birthday);
		}
		
		return infor;
		
		
		
	}
	

}
