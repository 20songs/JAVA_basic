package pjt_OOP_3;

public class MainClass {

	public static void main(String[] args) {
		
		// ����Ʈ ������
		ObjectEx obj1 = new ObjectEx();
		
		System.out.println();
		
		// ����� ����
		ObjectEx obj2 = new ObjectEx(10);

		System.out.println();
		
		int [] Arr = {10,20,30};
		int n = 10;
		ObjectEx obj3 = new ObjectEx("This is Class", n, Arr);

		System.out.println();

		// �Ҹ���
		ObjectEx obj4;
		
		obj4 = new ObjectEx();
		obj4 = new ObjectEx();
		
		// ��� �ڹٴ� �޸𸮸� �����ڰ� �������� �ʾ�
		// system.gc�� ����ϴ� ��찡 �幰��
		// ������ ���� ���ּ��� ������ ���
		// �̷� ����� �ִٴ� ��
		System.gc();
		
		System.out.println();

		
		//this Ű����
		int ints[] = {10,20,40};
		ObjectEx obj5 = new ObjectEx(10,"Javav",ints);
		
		ObjectEx obj6 = new ObjectEx(10,30);
		obj6.getInfo();
		
		
	}
}
