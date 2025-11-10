package com.codegnan.fundamentals;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle :");
		int radius=sc.nextInt();
		double pi=3.14;
		double area=pi*radius*radius;
		
		System.out.printf("%.2f",+area);
		sc.close();
		
		

	}

}
