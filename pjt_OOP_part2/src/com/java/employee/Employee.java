package com.java.employee;

public class Employee {
	
	//��� ����(�Ӽ�)�� ��� private ����
	private String name;
	private String empNo;
	private int pay;
	
	public Employee(String name, String empNo, int pay) {
		this.name = name;
		this.empNo = empNo;
		this.pay = pay;
	}
	
	public void getInfo() {
		System.out.println("--getInfo()----");
		System.out.println("name : " + name);
		System.out.println("empNo :" + empNo);
		System.out.println("pay : " + pay);
	}

	// getter, setter �ڵ��ϼ� ���� (���콺 ��Ŭ�� - source - generate)
	
	public String getName() {
		return name;
	}
	// �̸��� ���� �ȵȴ�!
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public int getPay() {
		return pay;
	}
	
	// ���� set �޼��带 ����ϴ� ���� ���� ��ġ ��� ����
	public void setPay(int pay) {
		if (pay < 10000000) this.pay = pay;
		else System.out.println("pay under 10000000");
	}
	
}
