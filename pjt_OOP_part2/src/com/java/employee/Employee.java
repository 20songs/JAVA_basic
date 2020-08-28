package com.java.employee;

public class Employee {
	
	//멤버 변수(속성)의 경우 private 설정
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

	// getter, setter 자동완성 생성 (마우스 우클릭 - source - generate)
	
	public String getName() {
		return name;
	}
	// 이름은 변경 안된다!
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
	
	// 굳이 set 메서드를 사용하는 것은 안전 장치 사용 목적
	public void setPay(int pay) {
		if (pay < 10000000) this.pay = pay;
		else System.out.println("pay under 10000000");
	}
	
}
