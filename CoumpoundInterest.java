package com.codegnan.fundamentals;

import java.util.Scanner;

public class CoumpoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount:");
		double principle=sc.nextDouble();
		System.out.println("Enter Rate:");
		double rate=sc.nextDouble();
		System.out.println("Enter Time period:");
		double time=sc.nextDouble();
		
		double amount=principle*Math.pow((1+rate/100),time);
		double coumpoundInterest=amount-principle;
		System.out.println("Amount : "+amount);
		System.out.println("Coumpound Interest : "+coumpoundInterest);
		sc.close();

	}

}
