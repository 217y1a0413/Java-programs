package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount:");
		double principle=sc.nextDouble();
		System.out.println("Enter Rate:");
		double rate=sc.nextDouble();
		System.out.println("Enter Time period:");
		double time=sc.nextDouble();
		
		double si=(principle*rate*time)/100;
		double totalAmount=principle+si;
		System.out.println("Simple Interest : "+si);
		System.out.println("Total amount : "+totalAmount);
		sc.close();

	}

}
