package order;

public class CanOrderList {

	String bigCategory;
	String mediCategory;
	String name;
	int price;
	int count;
	ListManagement lists = new ListManagement();
	

	CanOrderList(String bigCategory, String mediCategory, String name, int price, int count) {
		this.bigCategory = bigCategory;
		this.mediCategory = mediCategory;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	

	void showData(int i) {
		System.out.println("==========================================================================");
		System.out.println(
				"["+i+"]대분류 : "+ bigCategory +"\t\t중분류 : "+ mediCategory+"\t이름 : " + name + "\n\t\t\t\t\t가격 : " + price +"원 \t 발주 가능 개수 : " + count+"개");
	}
}

