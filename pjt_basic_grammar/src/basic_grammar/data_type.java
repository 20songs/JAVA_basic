package basic_grammar;

public class data_type {
	/* 데이터 타입 종류: */
	/* 기본 자료형 / 객체형(주소 값으로 16진수를 할당, 항상 4byte) */
	/* 정수형: byte(1byte), char(2byte) short(2byte) int(4byte) long(8byte)*/
	/* 실수형: float(4byte), double(8byte)*/
	/* 논리형: boolean(1byte) */
	/* 문자열: String(객체 자료형, 메모리 직접 할당) */
	public static void main(String[] args) {
		
		char cha = 'a';
		System.out.println("cha=" +cha);
		
		int i = 10;
		System.out.println("i= " +i);
		
		double d = 10.123;
		System.out.println("d=" +d);
		
		boolean b = false;
		System.out.println("b=" +b);
		
		/* String str = new String(); */
		/* 원래 해줘야 하지만 string은 자주 쓰기 때문에 instance 생략 */
		String s = "Hello Java World!!!";
		System.out.println("s= " +s);
		
		s = "Done";
		System.out.println("s=" +s);
		
		// 자동(묵시적) 형 변환:
		//작은 공간의 메모리 -> 큰 공간 메모리
		byte by = 10;
		int in = by;
		System.out.println("in=" +in);
		
		// 명시적 형 변환:
		// 큰 공간 -> 작은 공간
		// 변하고자 하는 자료형()을 기입
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar=" +bVar);
		
		//손실 발생
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = "+bVar);
		
	}

}
