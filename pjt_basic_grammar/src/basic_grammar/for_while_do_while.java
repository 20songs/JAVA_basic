package basic_grammar;

import java.util.Scanner;

public class for_while_do_while {

	public static void main(String[] args) {
		
		// for, while은 조건이 참일 때까지 반복 수행
		
		// for 문
		System.out.print("INPUT NUMER: ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for (int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}
		
		// while 문
		System.out.print("INPUT NUMBER : ");
		int num = scanner.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
		}
		
		// do ~ while 문
		int j =10;
		do {
			System.out.println("무조건 1번은 실행합니다.");
			j++;
		} while (j < 13);
		
		do {
			System.out.println("최소한 1번은 실행합니다.");
		} while (j > 13);
	}
}
