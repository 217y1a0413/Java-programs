package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Input: ");
        String userInput=sc.nextLine();
        StringBuffer str1=new StringBuffer(userInput);
        System.out.println("Enter suffix string :");
		String prefix=sc.nextLine();
		StringBuffer str2=new StringBuffer(prefix);
		
		StringBuffer s=str2.append(str1);
		System.out.println(s);
		sc.close();
		
	}

}
