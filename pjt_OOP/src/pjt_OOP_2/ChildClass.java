package pjt_OOP_2;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("Child Constructor");
	}
	
	// public: ������         [���� ����, ���]
	// void: ��ȯ ��          [�迭, �ڷ��� ��]
	// getInfo: �޼��� �̸� [�ҹ��ڷ� ����, ���� �ܾ� �빮��(��Ÿǥ���)]
	// (): �ް� ����           
	//�ż��� ����
	public void getInfo() {    
		// �޼��� ����
		System.out.println("--getInfo()--");
		
		System.out.println("name :" + name);
		System.out.println("gender :" + gender);
		System.out.println("age :" + age);
	}
	
	// �Ű� ������ ����� �޼���
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo() ---");
		
		name = n;
		gender = g;
		age = a;
	}
	
	// �ߺ� �޼���, �� �з�����, �Ű� ������ ������ Ÿ���� �޶�� �Ѵ�!
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
	// public ���� ȣ���� �Ұ���
	// ���ο����� �󸶵��� ��� ������
	private void mySecret() {
		System.out.println("--mySecret--");
	}
}
