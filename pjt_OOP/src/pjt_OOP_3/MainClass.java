package pjt_OOP_3;

public class MainClass {

	public static void main(String[] args) {
		
		// 디폴트 생성자
		ObjectEx obj1 = new ObjectEx();
		
		System.out.println();
		
		// 사용자 정의
		ObjectEx obj2 = new ObjectEx(10);

		System.out.println();
		
		int [] Arr = {10,20,30};
		int n = 10;
		ObjectEx obj3 = new ObjectEx("This is Class", n, Arr);

		System.out.println();

		// 소멸자
		ObjectEx obj4;
		
		obj4 = new ObjectEx();
		obj4 = new ObjectEx();
		
		// 사실 자바는 메모리를 개발자가 관리하지 않아
		// system.gc를 사용하는 경우가 드물다
		// 가급적 빨리 해주세요 정도의 기능
		// 이런 기능이 있다는 것
		System.gc();
		
		System.out.println();

		
		//this 키워드
		int ints[] = {10,20,40};
		ObjectEx obj5 = new ObjectEx(10,"Javav",ints);
		
		ObjectEx obj6 = new ObjectEx(10,30);
		obj6.getInfo();
		
		
	}
}
