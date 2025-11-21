package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Input: ");
		String userInput=sc.nextLine();
		System.out.println("Enter replace string :");
		String replaceString=sc.nextLine();
		StringBuffer str1=new StringBuffer(userInput);
		//StringBuffer str2=new StringBuffer(replaceString);
		
		System.out.println("Enter the Start index : ");
		int startIndex=sc.nextInt();
		System.out.println("Enter the End index : ");
		int endIndex=sc.nextInt();
		StringBuffer str=str1.replace(startIndex, endIndex, replaceString);
		System.out.println(str);
		sc.close();
	}

}
