package op;

public class OperatorEx14 {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = (char)(c1+1);
		char c3 = 'a'+1; // �씪�씤 6 : 而댄뙆�씪 �뿉�윭 �뾾�쓬.
		System.out.println(c2);
	---------------------------------------------------------------------------	
		char c1 = 'a';
		// char c2 = c1+1; // �씪�씤 5 : 而댄뙆�씪 �뿉�윭 諛쒖깮!!!
		char c2 = 'a'+1; // �씪�씤 6 : 而댄뙆�씪 �뿉�윭 �뾾�쓬.
		System.out.println(c2);
		
		}
	
}
		

