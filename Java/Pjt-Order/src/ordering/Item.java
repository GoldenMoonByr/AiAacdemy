package ordering;

public class Item {
	private String bigCategory;
	private String mediCategory;
	private String name;
	private int price;
	private int count;
	
	Item(){
		
	}
	
	Item(String bigCategory,String mediCategory,String name,int price,int count){
		this.bigCategory = bigCategory;
		this.mediCategory = mediCategory;
		this.name= name;
		this.price = price;
		this.count = count;
	}
	
	public String getBigCategory(){
		return this.bigCategory;
	}
	
	public void setBigCategory(String bigCategory) {
		this.bigCategory = bigCategory;
	}

	public String getMediCategory(){
		return this.mediCategory;
	}
	
	public void setMediCategory(String mediCategory) {
		this.mediCategory = mediCategory;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price= price;
	}
	
	
	public int getCount(){
		return this.count;
	}
	
	public void setCount(int count) {
		this.count= count;
	}
	
	void showData(int i) {
		System.out.println("==========================================================================");
		System.out.println(
				"["+i+"]대분류 : "+ bigCategory +"\t\t중분류 : "+ mediCategory+"\t\t이름 : " + name + "\n\t가격 : " + price +"원 \t\t 발주 가능 개수 : " + count+"개");
	}
	
	

}
