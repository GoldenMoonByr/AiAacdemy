package order;

public class item {
	private String name;
    private int price;
    private int	count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /*상품목록출력*/
    @Override
    public String toString() {
        return "상품{" +
                "이름='" + name + '\'' +
                ", 가격=" + price +
                ", 수량=" + count +
                '}';
    }

}
