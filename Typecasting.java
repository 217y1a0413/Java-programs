package com.codegnan.fundamentals;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of test1:");
		int test1=sc.nextInt();
		System.out.println("enter the marks of test2:");
		int test2=sc.nextInt();
		System.out.println("enter the marks of test3:");
		int test3=sc.nextInt();
		double average=(test1+test2+test3)/3.0;//implicit typecasting
		int roundedaverage= (int)average;
		System.out.println("student test scores:"+test1+","+test2+","+test3);
		System.out.println("average:"+average);
		System.out.println("roundedaverage:"+roundedaverage);
		sc.close();
		
		
		
		
		

	}

}
