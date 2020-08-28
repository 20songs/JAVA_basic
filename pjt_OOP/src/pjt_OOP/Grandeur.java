package pjt_OOP;

// 일반적인 클래스 이름은 첫 글자 대문자
public class Grandeur { 
	// 멤버 변수 (속성) 선언
	public String color;   
	public String gear;
	public int price;
	
	// 생성자
	// 클래스 이름과 동일, 반환 값도 없음
	// 생성 때 필요한 기능이 없으면 빈 공간도 괜찮음
	public Grandeur() {
		System.out.println("Grandeur contstructur");
	}
	
	// 메서드(기능) 선언
	// void는 반환 값이 없을 때 사용하는 자료형
	public void run() {
		System.out.println("--run--");
	}
	
	public void stop() {
		System.out.println("--stop--");
	}
	
	public void info() {
		System.out.println("--info()--");
		System.out.println("color :" + color);
		System.out.println("gear :" + gear);
		System.out.println("price :" + price);
	}

}
