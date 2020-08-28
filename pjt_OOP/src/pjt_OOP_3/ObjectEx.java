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
	
	// this Ű����
	public ObjectEx(int i, String s, int is[]) {
		System.out.println("User Defined by this");
		this.num = i;
		this.str = s;
		this.nums = is;
	}

	// this�� Ŭ������ ������ ��ü ���θ� ���ٽ�Ű��
	// �ű⿡ ����� global ������ �����ϰ� ����
	public ObjectEx(int x, int y) {
		// x,y�� ���� ����
		// this�� �۷ι� x,y�� ����Ŵ
		this.x = x;
		this.y = y;
		
	}
	
	public void getInfo() {
		System.out.println("x ===> " + x);
		System.out.println("y ===> " + y);
		
	}
	
	// Ŭ������ ������� ���� ����
	// GC�� ����� �����ϰ� �ϴ� ��
	@Override
	protected void finalize() throws Throwable {
		System.out.println("--finalize() method--");
		
		super.finalize();
	}
	
}
