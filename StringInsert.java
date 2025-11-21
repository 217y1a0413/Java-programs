package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringInsert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Original String :");
		String str1=sc.nextLine();
		
		System.out.println("Enter the Index : ");
		int index=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Inserted String :");
		String str2=sc.nextLine();
		
		String s3=str1.substring(0,index)+str2+str1.substring(index);
		 System.out.println(s3);
		 sc.close();
	}

}
