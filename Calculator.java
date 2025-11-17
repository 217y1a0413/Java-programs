package com.codegnan.inheritance;

import java.util.Scanner;

public final class Calculator {
	final int factor=2;

	public final int getResult(int num,int code) {
		if(code==1) {
			return num*factor;
			}
		if(code==2) {
			return num/factor;
		}
		return code;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int code=sc.nextInt();
		Calculator c=new Calculator();
		System.out.println(c.getResult(num, code));
		sc.close();
	}
	
	

}
