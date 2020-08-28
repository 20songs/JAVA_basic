package com.java.employeeBank;

public class EmployeeBank {

	String name;
	static int amount = 0;
	// 별도의 메모리에 관리되는 객체가 공유할 수 있는 속성값
	
	public EmployeeBank(String name) {
		this.name = name;
	}
	
	public void saveMoney(int money) {
		
		amount += money;
		System.out.println("amount : " + amount);
		
	}
	
	public void spendMoney(int money) {
		
		amount -= money;
		System.out.println("amount : " + amount);
		
	}
	
	public void getBankInfo() {
		
		System.out.println("Employee name : " + this.name);
		System.out.println("amount : " + amount);
		
	}
	
}
