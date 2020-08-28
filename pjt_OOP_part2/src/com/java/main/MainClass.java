package com.java.main;

// import com.java.dailyJournal.*; ��Ű�� �� Ŭ������ ���� �� �����ϴ� ���
import com.java.dailyJournal.DailyJournal;
import com.java.employee.Employee;
import com.java.employeeBank.EmployeeBank;
import com.java.pay.Payment;
import com.java.pay.fullTime.FullTime;
import com.java.pay.partTime.PartTime;
import com.java.util.Util;
import com.java.welfare.Welfare;

public class MainClass {

	public static void main(String[] args) {
		
		DailyJournal dailyJournal = new DailyJournal();
		Payment payment = new Payment();
		FullTime fullTime = new FullTime();
		PartTime partTime = new PartTime();
		Util util = new Util();
		Welfare welfare = new Welfare();
		
		System.out.println();
		
		EmployeeBank parkBank = new EmployeeBank("����ȣ");
		parkBank.saveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("�̽¿�");
		leeBank.saveMoney(300);
		
		// amount�� �����ϰ� ���� static�� ����
		// ���� ����!
		leeBank.getBankInfo();
		
		parkBank.spendMoney(400);
		
		leeBank.getBankInfo();
		
		// setter, getter
		Employee employee1 = new Employee("�̴�ȣ", "4��", 100000);
		employee1.getInfo();
		
		employee1.setPay(2000000);
		employee1.getInfo();
		employee1.setPay(10000001);
		employee1.getInfo();
		
	}
	
}
