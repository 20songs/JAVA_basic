package basic_grammar;

import java.util.Scanner;

public class for_while_do_while {

	public static void main(String[] args) {
		
		// for, while�� ������ ���� ������ �ݺ� ����
		
		// for ��
		System.out.print("INPUT NUMER: ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for (int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}
		
		// while ��
		System.out.print("INPUT NUMBER : ");
		int num = scanner.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
		}
		
		// do ~ while ��
		int j =10;
		do {
			System.out.println("������ 1���� �����մϴ�.");
			j++;
		} while (j < 13);
		
		do {
			System.out.println("�ּ��� 1���� �����մϴ�.");
		} while (j > 13);
	}
}
