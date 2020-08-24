package basic_grammar;

public class data_type {
	/* ������ Ÿ�� ����: */
	/* �⺻ �ڷ��� / ��ü��(�ּ� ������ 16������ �Ҵ�, �׻� 4byte) */
	/* ������: byte(1byte), char(2byte) short(2byte) int(4byte) long(8byte)*/
	/* �Ǽ���: float(4byte), double(8byte)*/
	/* ����: boolean(1byte) */
	/* ���ڿ�: String(��ü �ڷ���, �޸� ���� �Ҵ�) */
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
		/* ���� ����� ������ string�� ���� ���� ������ instance ���� */
		String s = "Hello Java World!!!";
		System.out.println("s= " +s);
		
		s = "Done";
		System.out.println("s=" +s);
		
		// �ڵ�(������) �� ��ȯ:
		//���� ������ �޸� -> ū ���� �޸�
		byte by = 10;
		int in = by;
		System.out.println("in=" +in);
		
		// ����� �� ��ȯ:
		// ū ���� -> ���� ����
		// ���ϰ��� �ϴ� �ڷ���()�� ����
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar=" +bVar);
		
		//�ս� �߻�
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = "+bVar);
		
	}

}
