package basic_grammar;

import java.util.Arrays;

public class Memory_Array {

	public static void main(String[] args) {
		
		// �迭�� �ּҸ� ������ �ִ� �ڷ����̴�!
		
		//  �迭 �⺻�Ӽ�
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// �迭 ����
		System.out.println("arrAtt1.length: " + arrAtt1.length);
		
		// �迭 ��� ���
		System.out.println("arrAtt1: " + Arrays.toString(arrAtt1));
		
		// �迭 ��� ����
		// arrAtt3 �� arrAtt1�� �ּҴ� �ٸ����� ���� ����
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3: " + Arrays.toString(arrAtt3));
		
		// �迭 ���۷���
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt2: " + Arrays.toString(arrAtt2));
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		// ������ �迭
		// ù��°�� ��, �ι�°�� ��
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0]: " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1]: " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2]: " + Arrays.toString(arrMul[2]));
		
	}
	
}
