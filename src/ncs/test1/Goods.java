package ncs.test1;

public class Goods {
	private String name;
	private int price;
	private int quantity;
	static int a=0;
	
	public Goods() {
	}
	public Goods(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return this.name+", "+this.price+" ��, "+this.quantity+" ��";
	}
	public static void main(String[] args) {
		a=1;
		getT();
	}
	public static void getT() {
		System.out.println(a);
	}
}
