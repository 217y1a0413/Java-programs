package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferDelete {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Input: ");
		String userInput=sc.nextLine();
		StringBuffer str1=new StringBuffer(userInput);
		
		System.out.println("Enter the Start index : ");
		int startIndex=sc.nextInt();
		System.out.println("Enter the End index : ");
		int endIndex=sc.nextInt();
		StringBuffer str=str1.delete(startIndex, endIndex);
		System.out.println(str);
		sc.close();

	}

}
