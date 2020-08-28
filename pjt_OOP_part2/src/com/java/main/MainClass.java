package com.java.main;

// import com.java.dailyJournal.*; 패키지 내 클래스가 여러 개 존재하는 경우
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
		
		EmployeeBank parkBank = new EmployeeBank("박찬호");
		parkBank.saveMoney(100);
		
		EmployeeBank leeBank = new EmployeeBank("이승엽");
		leeBank.saveMoney(300);
		
		// amount를 공유하고 있음 static을 통해
		// 공동 저축!
		leeBank.getBankInfo();
		
		parkBank.spendMoney(400);
		
		leeBank.getBankInfo();
		
		// setter, getter
		Employee employee1 = new Employee("이대호", "4번", 100000);
		employee1.getInfo();
		
		employee1.setPay(2000000);
		employee1.getInfo();
		employee1.setPay(10000001);
		employee1.getInfo();
		
	}
	
}
