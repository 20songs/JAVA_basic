package pjt_OOP_3;

public class ObjectEx {
	
	public int x;
	public int y;
	
	int num;
	String str;
	int nums[];
	
	public ObjectEx() {
		System.out.println("Default constructor");
	}
	
	public ObjectEx(int i) {
		System.out.println("Custom constructor");
	}
	
	public ObjectEx(String s, int i, int arr[]) {
		System.out.println("User Defined constructor");
		str = s;
		num = i;
		nums = arr;
	}
	
	// this 키워드
	public ObjectEx(int i, String s, int is[]) {
		System.out.println("User Defined by this");
		this.num = i;
		this.str = s;
		this.nums = is;
	}

	// this는 클래스로 생성된 객체 내부를 접근시키며
	// 거기에 선언된 global 변수에 접근하게 해줌
	public ObjectEx(int x, int y) {
		// x,y는 로컬 변수
		// this는 글로벌 x,y를 가리킴
		this.x = x;
		this.y = y;
		
	}
	
	public void getInfo() {
		System.out.println("x ===> " + x);
		System.out.println("y ===> " + y);
		
	}
	
	// 클래스에 명시하지 않음 보통
	// GC의 기능을 수행하게 하는 것
	@Override
	protected void finalize() throws Throwable {
		System.out.println("--finalize() method--");
		
		super.finalize();
	}
	
}
