package basic_grammar;

public class regular_expression {
	
	public static void main(String[] args) {
		
		// Ư������ �ּ�
		System.out.println("Good \t Morning~");
		System.out.println("Good \n Morning~");
		System.out.println("Good\'Morning\'");
		System.out.println("\"Good Morning~\"");
		
		/* 
		 * ���� �� �ּ��� �̷���
		 * ������� �ϰų�
		 * ������ �� �� �ּ��� ���ϴ�
		 */
		
		// ���Ĺ���
		System.out.printf("������ ����� 10�� �Դϴ�.\n");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", 10);
		
		int num1 = 20;
		System.out.println("������ ����� " +num1+"�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n",num1);
		
		System.out.printf("ȫ�浿's Info. : %d�г� %d�� %d��\n",6,2,10);
		
		// ����(10����, 8����, 16����)
		int num2 = 30;
		System.out.printf("num2(10����): %d\n",num2);
		System.out.printf("num2(8����): %o\n",num2);
		System.out.printf("num2(16����): %x\n",num2);
		
		// ����
		char c1 = 'a';
		char c2 = 'A';
		System.out.println("�ҹ��� \'a\'�� �빮�ڴ� \'A\'�Դϴ�.\n");
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n",  'a', 'A');
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", c1, c2);
		
		
		// ���ڿ�
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println("\'java\'�� �빮�ڷ� �ٲٸ� \'JAVA\'�Դϴ�.");
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n", s1, s2);
		
		// �Ǽ�
		float f = 1.23f;
		System.out.printf("f=%f\n",f);
		
		double d = 1.23455d;
		System.out.printf("d=%f\n",d);
		
		//���Ĺ��� ���� ���
		System.out.printf("%d\n",123);
		System.out.printf("%d\n",1234);
		System.out.printf("%d\n",12345);
		
		System.out.println();
		
		System.out.printf("%5d\n",123);
		System.out.printf("%5d\n",1234);
		System.out.printf("%5d\n",12345);
		
		System.out.println();
		
		//���Ĺ��� �Ҽ������� ���
		System.out.printf("%f\n",1.23);
		System.out.printf("%.0f\n",1.23);
		System.out.printf("%.1f\n",1.23);
		System.out.printf("%.2f\n",1.23);
		System.out.printf("%.3f\n",1.23);
	}
}
