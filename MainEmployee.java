package com.codegnan.inheritance;

import java.util.Scanner;

abstract class Employee1 {
	String name;
	public Employee1(String name) {
		super();
		this.name=name;
	}
	public abstract double calculateSalary();
	public void display() {
		System.out.println("Employee Name :" + name);
	}
}
class FullTimeEmployee extends Employee1{
	double monthlySalary;
	public FullTimeEmployee(String name,double monthlySalary) {
		super(name);
		this.monthlySalary=monthlySalary;
		
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

}
class PartTimeEmployee extends Employee1{
	int hourlyRate;
	int hoursWorked;
	public PartTimeEmployee(String name,int hourlyRate,int hoursWorked) {
		super(name);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlyRate*hoursWorked;
	}
}
class ContractEmployee extends Employee1{
	double contractAmount;
	public ContractEmployee(String name,double contractAmount) {
		super(name);
		this.contractAmount=contractAmount;
	}
	public double calculateSalary() {
		return contractAmount;
	}
}
public class MainEmployee{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double ms=sc.nextDouble();
		int hr=sc.nextInt();
		int hw=sc.nextInt();
		int ca=sc.nextInt();
		Employee1 e=new FullTimeEmployee(name,ms);
		e.display();
		System.out.println(e.calculateSalary());
		Employee1 e1=new PartTimeEmployee(name,hr,hw);
	
		System.out.println(e1.calculateSalary());
		Employee1 e2=new ContractEmployee(name,ca);
	
		System.out.println(e2.calculateSalary());
		sc.close();
	}
}
