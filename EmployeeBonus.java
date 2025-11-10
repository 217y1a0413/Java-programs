package com.codegnan.oopexamples;

public class EmployeeBonus {
	int empId;
	String empName;
	double salary;
	int exp;
	double bonus;
	 public EmployeeBonus() {
		 this(0,"unknown");
		 
	 }
	 public EmployeeBonus(int empId,String empName) {
		 this(empId,empName,0.00);
		 
	 }
	 public EmployeeBonus(int empId, String empName, double salary) {
		this(empId,empName,salary,0);
		
	 }
	 public EmployeeBonus(int empId, String empName, double salary, int exp) {
		 if(exp<3) {
			bonus=salary*0.05;
		}if(exp>=3||exp<7) {
			bonus=salary*0.10;
		}if(exp>=7) {
			bonus=salary*0.15;
		}
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.exp = exp;
	 }
	 
	 public void displayInfo() {
		 System.out.println("Employee Id : " +empId);
		 System.out.println("Employee Name : " +empName);
		 System.out.println("Employee Salary : " +salary);
		 System.out.println("Employee Experience : " +exp);
		 System.out.println("Employee Bonus : " +bonus);
	 }
	 public static void main(String[] args) {
		 EmployeeBonus b=new EmployeeBonus(101,"Ravi",90000.0,8);
		 b.displayInfo();
	 }
	 
	 

}
