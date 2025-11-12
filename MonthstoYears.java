package com.codegnan.fundamentals;

import java.util.Scanner;

public class MonthstoYears {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal Amount : ");
		double pa=sc.nextDouble();
		System.out.println("Enter the Annual Interest : ");
		double interest=sc.nextDouble();
		System.out.println("Enter the Time : ");
		int months=sc.nextInt();
		int totalyears=months % 12;
		
		double  simpleInterest = (pa * interest * months) / 100;
		double  compoundInterest = pa*Math.pow((1 + interest/100),months) - pa;
		double totalSimpleInterest=pa+simpleInterest;
		double totalCompoundInterest=pa+compoundInterest;
		System.out.println("Total in years : " +totalyears);
		System.out.println("Simple Interest : " +simpleInterest);
		System.out.println(" Total with Simple Interest : " +totalSimpleInterest);
		System.out.println("Coumpound Interest : " +compoundInterest);
		System.out.println(" Total with Coumpound Interest : " +totalCompoundInterest);
         sc.close();
	}

}
