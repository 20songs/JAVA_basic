package pjt_OOP;

public class Bicycle {
	
	public String color;
	public int price;
	
	public Bicycle() {
		System.out.println("Bicycle contructor - I");
	}
	
	public Bicycle(String c, int p) {
		System.out.println("Bicycle contstructor - II");
		color = c;
		price = p;
	}
	
	public void info() {
		System.out.println(" -- info() -- ");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
