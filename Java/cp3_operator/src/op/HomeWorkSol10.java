package op;

/* 
�Ʒ��� ȭ��(Fahrenheit)�� ����(Celcius)�� ��ȯ�ϴ� �ڵ��̴�.
��ȯ������ 'C =5/9 ��(F - 32)'��� �� ��,(1)�� �˸��� �ڵ带 �����ÿ�.
��, ��ȯ ������� �Ҽ�����° �ڸ����� �ݿø��ؾ� �Ѵ�.

(Math.round()�� ������� �ʰ� ó���� ��)
 */
class HomeWorkSol10 {

	public static void main(String[]args){

		int fahrenheit=100;

		float celcius=((5/9f*(fahrenheit -32)*1000))%10>=5 ? ((int)((5/9f*(fahrenheit -32)*100)+10))/100f:((int)(5/9f*(fahrenheit -32)*100))/100f;
		


		System.out.println("Fahrenheit:"+fahrenheit);

		System.out.println("Celcius:"+celcius); 


		}

	}

