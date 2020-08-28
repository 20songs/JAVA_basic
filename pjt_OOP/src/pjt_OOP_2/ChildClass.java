package pjt_OOP_2;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("Child Constructor");
	}
	
	// public: 접근자         [접근 권한, 허용]
	// void: 반환 형          [배열, 자료형 등]
	// getInfo: 메서드 이름 [소문자로 시작, 다음 단어 대문자(낙타표기법)]
	// (): 메개 변수           
	//매서드 선언
	public void getInfo() {    
		// 메서드 정의
		System.out.println("--getInfo()--");
		
		System.out.println("name :" + name);
		System.out.println("gender :" + gender);
		System.out.println("age :" + age);
	}
	
	// 매게 변수를 사용한 메서드
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo() ---");
		
		name = n;
		gender = g;
		age = a;
	}
	
	// 중복 메서드, 단 패러미터, 매개 변수의 개수와 타입이 달라야 한다!
	// Overloading
	public void getInfo(int x, int y) {
		System.out.println("--getInfo -- II --");
		System.out.printf("parameter --> x: %d, y: %d\n", x, y);
	}
	
	public void getInfo(String s1, String s2) {
		System.out.println("--getInfo -III---");
		System.out.printf("parameter -> s1 : %s, s2 : %s\n", s1, s2);
	}
	
	// private method
	// public 에서 호출이 불가능
	// 내부에서는 얼마든지 사용 가능함
	private void mySecret() {
		System.out.println("--mySecret--");
	}
}
