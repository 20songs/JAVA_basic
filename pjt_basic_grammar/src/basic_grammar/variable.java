package basic_grammar;

public class variable {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j;
		j = 100;
		
		System.out.println("i + j=" + (i+j));
		/* ������ �� ���� */
		i = 100;
		/* int i�� ������ +��� ��ȣ�� �ʿ��ѵ�! */
		System.out.println("i=" +i);
		
		i = 300;
		
		System.out.println("i=" + i);
		
		i =0;
		System.out.println("i=" + i);
	}
}
