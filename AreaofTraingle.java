package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaofTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the base of the traingle:");
		double base=sc.nextDouble();
		System.out.println("enter the height of the traingle:");
		double height=sc.nextDouble();
		double area=0.5*base*height;
		System.out.println("Area of traingle:"+area);
		sc.close();
		

	}

}
