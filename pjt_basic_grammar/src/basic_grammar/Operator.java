package basic_grammar;

public class Operator {
	
	public static void main(String[] args) {
		
		//대입 연산자
		int x = 10;
		int y = 20;
		
		System.out.println("x = " +x);
		System.out.println("y = " + y);
		
		x=y;
		System.out.println("x = " +x);
		System.out.println("y = " + y);
		
		// 산술 연산자
		x =10; y = 20;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x / y = " + ((float)x / y));
		System.out.println("x % y = " + (x % y));
		
		// 복합대입 연산자
		
		System.out.println("x += 10 : " + (x+=10));
		System.out.println("x -= 10 : " + (x-=10));
		System.out.println("x *= 10 : " + (x*=10));
		System.out.println("x /= 10 : " + (x/=10));
		System.out.println("x /= 10 : " + (float)(x /= 10));
		System.out.println("x %= 10 : " + (x%=10));
		
		//관계 연산자
		System.out.println("x>y:"+(x>y));
		System.out.println("x<y:"+(x<y));
		System.out.println("x>=y:"+(x>=y));
		System.out.println("x<y:"+(x<=y));
		System.out.println("x==y:"+(x==y));
		System.out.println("x!=y:"+(x!=y));
		
		// 증감 연산자
		// ++의 위치에 따라 출력과 연산의 선후 순서 차이가 생긴다
		x=10;
		System.out.println("++x :" + (++x));
		x=10;
		System.out.println("--x :" + (--x));
		x=10;
		System.out.println("x++ :" + (x++));
		System.out.println("x :" + (x));
		x=10;
		System.out.println("x-- :" + (x--));
		System.out.println("x :" + (x));
		
		//논리 연산자
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2: " + (b1 && b2));
		System.out.println("b1 || b2: " + (b1 || b2));
		System.out.println("!b1: " + (!b1));
		System.out.println("!b2: " + (!b2));
		
		// 삼항 연산자
		x=10; y=20;
		int result = 0;
		result = (x>y) ? 100: 200;
		System.out.println("x>y result :" + result);
		
		result = (x<y) ? 100: 200;
		System.out.println("x<y result :" + result);
		
		result = (x==y) ? 100: 200;
		System.out.println("x==y result :" + result);
		
		//비트 연산자
		x = 2; y = 3;
		System.out.println("x & y : " + (x & y));
		System.out.println("x | y : " + (x | y));
		System.out.println("x ^ y : " + (x ^ y));
	}
}
