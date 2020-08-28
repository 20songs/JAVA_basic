package pjt_OOP_2;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		child1.name = "hong gil dong";
		child1.gender = "M";
		child1.age = 20;
		
		child1.getInfo();
		
		ChildClass child2 = new ChildClass();
		child2.setInfo("Go gil dong", "M", 40);
		child2.getInfo();
		child2.getInfo(3, 4);
		child2.getInfo("a", "b");
		
		
		// ��ü�� �������̴�!, �ּҰ��� �Ҵ� �޴´�!
		ObjectClass ojt1 = new ObjectClass();
		ObjectClass ojt2 = new ObjectClass();
		ObjectClass ojt3 = new ObjectClass();
		
		System.out.println("ojt1 -->" + ojt1);
		System.out.println("ojt2 -->" + ojt2);
		System.out.println("ojt3 -->" + ojt3);
		
		if(ojt1 == ojt2) {
			System.out.println("ojt1 == ojt2");
		} else {
			System.out.println("ojt1 != ojt2");
		}
		
		if(ojt2 == ojt3) {
			System.out.println("ojt2 == ojt3");
		} else {
			System.out.println("ojt2 != ojt3");
		}
		
		if(ojt3 == ojt1) {
			System.out.println("ojt1 == ojt3");
		} else {
			System.out.println("ojt1 != ojt3");
		}
		
		ojt1.getInfo();
		
		ojt1 = null;   //���۷����� �����ϴ�
		//ojt1.getInfo();   // Exception �߻�, ojt1�� GC�� ���� ȸ����
		// �޸𸮴� ��������� ���۷����� �ٸ� ���� �ٽ� �Ҵ��ϸ� ���� ������
		
		ojt2.getInfo();
	}
}
