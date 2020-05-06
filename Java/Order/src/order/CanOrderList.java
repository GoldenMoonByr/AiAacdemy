package order;

public class CanOrderList {

	String bigCategory;
	String mediCategory;
	String name;
	int price;
	int count;

	CanOrderList(String bigCategory, String mediCategory, String name, int price, int count) {
		this.bigCategory = bigCategory;
		this.mediCategory = mediCategory;
		this.name = name;
		this.price = price;
		this.count = count;
	}

	void showData() {
		System.out.println("==========================================================================");
		System.out.println(
				"대분류 : " + bigCategory + "\t\t\t중분류 : " + mediCategory + "\t\t이름 : " + name + "\t\t가격 : " + price +"원 \t 개수 : " + count+"개");
	}
}
