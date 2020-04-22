package ver03;

import java.util.Scanner;

/*
Project : ver 0.30
�迭�� �̿��ؼ� ���α׷� ����ڰ� �Է��ϴ� ������ �ִ� 100������ �����ǵ��� ���α׷��� ����. 
�Ʒ���� ����
���� : �̸�, ��ȭ��ȣ, ������� ������ ������� �ϴ� ����
�˻� : �̸��� �������� �����͸� ã�Ƽ� �ش� �������� ������ ���
���� : �̸��� �������� �����͸� ã�Ƽ� �ش� �����͸� ����
������ ���� �� �����ִ� ������ ó���� �����͸� �� ������ ���� ����������
������ 2���� �����Ǿ��ٸ� 3�� ���� �����͵��� �ּ� ���� -1 ó���Ǿ� ������.
*/

public class PhoneBookManager {
	Scanner sc = new Scanner(System.in);
	PhoneInfor infor = null;
	// PhoneInfor ���� infor�� ����ϱ� ���� �ʱ�ȭ.
	PhoneInfor[] members = new PhoneInfor[100];
	int cn = 0;

	// �� �迭 �ּҿ� �� ��ü ����
	void addInfo() {
		members[cn] = makeInstance();
		cn++;
	}

	// ����� �迭 �ε��� ��ȣ�� ȣ��
	// toString �������̵��ؼ� ����ϰų�
	// PhoneInfor�� �ν��Ͻ��޼ҵ� ���
	void showAllData() {
		for (int i = 0; i < cn; i++) {
			members[i].showInfo();
			System.out.println("--------------------");
		}

	}

	int searchIndex(String name) {

		int indexNum = -1;

		for (int i = 0; i < cn; i++) {
			if (members[i].nameIndexCheck(name)) {
				indexNum = i;
				break;
			}
		}
		return indexNum;
	}

	void searchInfo() {
		int searchNameIndex = -1;
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �Է����ּ���.");
		String name = sc.nextLine();
		searchNameIndex = searchIndex(name);

		if (searchNameIndex < 0) {
			System.out.println("ȸ�������� �����ϴ�.");
		} else {

			members[searchNameIndex].showInfo();

		}
		
	}
		
	void deleteInfo() {
		int searchNameIndex ;
		System.out.println("�����ϰ��� �ϴ� �̸��� �Է����ּ���.");
		String name = sc.nextLine();
		searchNameIndex = searchIndex(name);
		
		if (searchNameIndex < 0) {
			System.out.println("ȸ�������� �����ϴ�.");
		} else {

			for(int i=searchNameIndex; i<cn-1 ; i++) {
				members[i] = members[i+1];
			}
			
			cn--;
			
			System.out.println(members[searchNameIndex].name+"���� ������ �����߽��ϴ�.");

		}
		
		
	}

	

	PhoneInfor makeInstance() {
		System.out.println("������ �Է����ּ���. :");
		String name = sc.nextLine();
		System.out.println("��ȭ ��ȣ�� �Է����ּ���. :");
		String phoneNumber = sc.nextLine();
		System.out.println("��������� �Է����ּ���. :");
		String birthday = sc.nextLine();

		// birthday �Է� ������ ���� �ٸ� �����ڵ� �ֱ� ���� ���ǹ�
		// .trim=>�糡 ���� ���� , .isEmpty()=>�������� Ȯ��(boolean��)
		if (birthday == "" || birthday.trim().isEmpty()) {
			infor = new PhoneInfor(name, phoneNumber);
		} else {
			infor = new PhoneInfor(name, phoneNumber, birthday);
		}

		return infor;

	}

}
