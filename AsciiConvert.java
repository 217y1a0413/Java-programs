package com.codegnan.fundamentals;

import java.util.Scanner;

public class AsciiConvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char digit=sc.next().charAt(0);
		int result=(int)digit;
		System.out.println(result);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num%2==0 && num==0) {
			System.out.println("even");
		}
		System.out.println("odd");
		
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		if(year%4==0) {
			System.out.println(" leapyear");
		}
		else if(year%100!=0) {
			System.out.println(" not leap year");
		}
		else if(year%400==0) {
					System.out.println("leap year");
					
				}else {
				System.out.println(" not leapyear");
				}
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		String result1=(n<0)?"Negative":(n>0)?"Positive":"zero";
		System.out.println(result1);
		
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		String result2=(no%5==0)?"Yes":"NO";
		System.out.println(result2);
        sc.close();
	}

}
