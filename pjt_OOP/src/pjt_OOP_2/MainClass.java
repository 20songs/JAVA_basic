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
		
		
		// 객체는 참조형이다!, 주소값을 할당 받는다!
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
		
		ojt1 = null;   //레퍼런스를 끊습니다
		//ojt1.getInfo();   // Exception 발생, ojt1은 GC에 의해 회수됨
		// 메모리는 사라지지만 레퍼런스는 다른 값에 다시 할당하면 참조 가능함
		
		ojt2.getInfo();
	}
}
