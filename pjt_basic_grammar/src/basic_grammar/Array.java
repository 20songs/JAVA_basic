package basic_grammar;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		// 배열은 같은 자료형 데이터의 묶음
		// 인덱스로 관리 길이 = 인덱스 +1
		
		// 배열 선언 후 초기화
		// 배열은 한 번 선언하면 크기가 변경되지 않음
		int[] arr1 = new int[5]; // 배열 선언, new를 통해 메모리 크기 지정
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0]: "+arr1[0]);
		System.out.println("arr1[1]: "+arr1[1]);
		System.out.println("arr1[2]: "+arr1[2]);
		System.out.println("arr1[3]: "+arr1[3]);
		System.out.println("arr1[4]: "+arr1[4]);
		
		
		// 배열 선언과 초기화 동시
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0]: "+arr2[0]);
		System.out.println("arr2[1]: "+arr2[1]);
		System.out.println("arr2[2]: "+arr2[2]);
		System.out.println("arr2[3]: "+arr2[3]);
		System.out.println("arr2[4]: "+arr2[4]);
		
		// 배열을 이용한 학사관리
		String[] name = {"박찬호", "이승엽", "이병규", "류현진", "이대호"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s 점수 : \t %.2f\n", name[0], (double)score[0]);
		System.out.printf("%s 점수 : \t %.2f\n", name[1], (double)score[1]);
		System.out.printf("%s 점수 : \t %.2f\n", name[2], (double)score[2]);
		System.out.printf("%s 점수 : \t %.2f\n", name[3], (double)score[3]);
		System.out.printf("%s 점수 : \t %.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2]  + score[3] + score[4]) / 5;
		System.out.printf("-------------------------\n 평 균: \t %.2f",ave);
		
		scanner.close();
		
	}

}
