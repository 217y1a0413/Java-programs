package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferSuffix {

	public static void main(String[] args) {

		
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter User Input: ");
          String userInput=sc.nextLine();
          

          StringBuffer str1=new StringBuffer(userInput);
		
		System.out.println("Enter the Index : ");
		int num=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter suffix string :");
		String suffix=sc.nextLine();
		StringBuffer str2=new StringBuffer(suffix);
		
		StringBuffer str=str1.append(num);
		StringBuffer s=str.append(str2);
		System.out.println(s);
		sc.close();
		
		
		

	}

}
