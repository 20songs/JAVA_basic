package pjt_OOP;

public class MainClass {

	public static void main(String[] args) {
		
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price =30000000;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		System.out.println();
		
		Grandeur myCar2 = new Grandeur();
		myCar2.color = "silver";
		myCar2.gear = "auto";
		myCar2.price = 50000000;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		Bicycle myBicycle = new Bicycle();
		myBicycle.color = "red";
		myBicycle.price = 100;
		
		myBicycle.info();
		
		Bicycle myBicycle2 = new Bicycle("blue",110);
		
		myBicycle2.info();
		
		myBicycle2.color = "yellow";
		myBicycle2.info();
		
		System.out.println("----------------------------");
		
		
	}
}
