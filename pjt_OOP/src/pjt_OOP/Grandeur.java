package pjt_OOP;

// �Ϲ����� Ŭ���� �̸��� ù ���� �빮��
public class Grandeur { 
	// ��� ���� (�Ӽ�) ����
	public String color;   
	public String gear;
	public int price;
	
	// ������
	// Ŭ���� �̸��� ����, ��ȯ ���� ����
	// ���� �� �ʿ��� ����� ������ �� ������ ������
	public Grandeur() {
		System.out.println("Grandeur contstructur");
	}
	
	// �޼���(���) ����
	// void�� ��ȯ ���� ���� �� ����ϴ� �ڷ���
	public void run() {
		System.out.println("--run--");
	}
	
	public void stop() {
		System.out.println("--stop--");
	}
	
	public void info() {
		System.out.println("--info()--");
		System.out.println("color :" + color);
		System.out.println("gear :" + gear);
		System.out.println("price :" + price);
	}

}
