package op;

/* 
������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�,
���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�.
�����ڵ�� �ҹ��ڰ� �빮�ں���32��ŭ �� ũ��.
������� 'A���� �ڵ��65�̰� ��a'�� �ڵ��97�̴�. 
(1)~(2)�� �˸��� �ڵ带 �����ÿ�.
 */
class HomeWorkSol13 {
	public static void main(String[] args) {
		
			char ch = 'z';

			char lowerCase = ch>=97? (char)(ch-32):ch;
			

			System.out.println("ch:"+ch);

			System.out.println("chto lowerCase:"+lowerCase);
			
	}
}
